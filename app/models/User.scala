package models

import controllers.UserDao
import play.api.libs.json._
import reactivemongo.bson._
import scala.collection.Map
import play.api.libs.json.JsValue
import services.actors.UserInfosActor
import services.endpoints.JsonRequest._
import play.api.libs.iteratee._
import reactivemongo.bson.handlers.{ BSONReader, BSONWriter }
import reactivemongo.bson.handlers.DefaultBSONHandlers._
import java.util.Date
import play.api.Logger
import models.user._

case class User(
  accounts: Seq[Account],
  distants: Option[Seq[ProviderUser]] = None,
  columns: Option[Seq[Column]] = None)

object User {
  
  def create(id: String): User = {
    User(Seq[Account](Account(id, new Date())))
  }

  def toJson(user: User): JsValue = {
    val accounts = user.accounts
    val distants = user.distants.getOrElse { Seq() }
    val columns = user.columns.getOrElse { Seq() }
    JsObject(Seq(
      "accounts" -> Json.toJson(accounts),
      "distants" -> Json.toJson(distants),
      "columns" -> Json.toJson(columns)))
  }
  
  def tableTo[Obj](document: BSONDocument, key:String, transform:(TraversableBSONDocument) => Obj):Seq[Obj] = {
    val doc = document.toTraversable
    val objs = doc.getAs[BSONArray](key).getOrElse(BSONArray()).toTraversable.iterator
    val seqObjs = for (obj <- objs) yield {
      val a = obj.value.asInstanceOf[BSONDocument].toTraversable
      transform(a)
    }
    seqObjs.toList
  }
  
  /**
   * From bd, keep comment for condition's providers
   */
  implicit object UserBSONReader extends BSONReader[User] {
    def asString(doc:TraversableBSONDocument, key:String):String = {
      doc.getAs[BSONString](key).get.value
    }
    
    def fromBSON(document: BSONDocument): User = {
      val accounts = tableTo[Account](document, "accounts", { a =>
        val lastUse = new Date()
        lastUse.setTime(a.getAs[BSONDateTime]("lastUse").get.value)
        Account(
          asString(a, "id"),
          lastUse)
      })
      val providers = tableTo[ProviderUser](document, "distants", { d =>
        ProviderUser(
          asString(d, "id"),
          asString(d, "social"),
          None, //d.getAs[BSONString]("login").get.value,
          None, //d.getAs[BSONString]("name").get.value,
          None, //Some(d.getAs[BSONString]("desc").get.value),
          None //Some(d.getAs[BSONString]("avatar").get.value)
          )
      })
      val columns = tableTo[Column](document, "columns", { c =>
        val unifiedRequests = tableTo[UnifiedRequest](c, "unifiedRequests", { r =>
          val requestArgs = r.getAs[BSONDocument]("args").get.toTraversable.iterator
          if(requestArgs.nonEmpty) {
            val args = for (requestArg <- requestArgs) yield {
              (requestArg.name, r.getAs[BSONDocument]("args").get.toTraversable.getAs[BSONString](requestArg.name).get.value)
            }
            UnifiedRequest(
              asString(r, "service"),
              Some(args.toMap))
          } else {
            UnifiedRequest(
              asString(r, "service"),
              None)
          }
        })
        Column(asString(c, "title"), unifiedRequests)
      })
      Logger.info("User = "+accounts+" :: "+providers+" :: "+columns)
      User(
        accounts,
        Some(providers),
        Some(columns))
    }
  }

  implicit object UserBSONWriter extends BSONWriter[User] {
    def toArray[Obj](objs:Seq[Obj], transform:(Obj) => BSONDocument):BSONArray = {
      val res = BSONArray().toAppendable
      for (obj <- objs) yield {
        res.append(transform(obj))
      }
      res
    }
    
    def toBSON(user: User) = {
      val accounts = toArray[Account](user.accounts, { account =>
        Account.toBSON(account)
      })

      val distants = toArray[ProviderUser](user.distants.getOrElse(Seq()), { distant =>
        ProviderUser.toBSON(distant)
      })

      val columns = toArray[Column](user.columns.getOrElse(Seq()), { column =>
        Column.toBSON(column)
      })

      BSONDocument(
        "accounts" -> accounts,
        "distants" -> distants,
        "columns" -> columns)
    }
  }

}