package controllers

import models.Service
import play.api.Logger
import play.api.mvc._
import services.actors.UserInfosActor
import services.auth.ProviderDispatcher
import services.security.AuthenticatedAction.Authenticated
import views.html._

object Application extends Controller {

  def index = Action { implicit request =>
    request.session.get("id").map(userId => {
      Ok(views.html.unified())
    }).getOrElse(Ok(views.html.index(Service.list)))
  }

  def authenticate(providerName: String) = Action { implicit request =>
    ProviderDispatcher(providerName).map(provider =>
      provider.auth(routes.Application.index)).getOrElse(BadRequest)
  }

  def logout() = Authenticated { action =>
    Logger.info("Aplication.scala :: KillMyActors :: " + action.user.accounts.last.id)
    UserInfosActor.killActorsForUser(action.user.accounts.last.id)
    //TODO remove session id
    Ok(views.html.index(Service.list(action.request)))
  }

}