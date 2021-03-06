package services.endpoints

import services.auth.GenericProvider
import services.auth.providers
import org.joda.time.format.DateTimeFormat
import parser.GenericParser
import parser.json.providers.BetaseriesTimelineParser
import parser.json.providers.GithubWallParser
import parser.json.providers.FacebookWallParser
import parser.json.providers.FacebookInboxParser
import parser.json.providers.TwitterDirectMessageParser
import parser.json.providers.BetaseriesPlanningParser
import parser.json.providers.GoogleplusWallParser
import parser.json.providers.TrelloWallParser
import parser.json.providers.ViadeoWallParser
import parser.json.providers.TwitterTimelineParser
import parser.json.providers.TwitterHashtagParser
import parser.json.providers.LinkedInWallParser
import services.auth.RssProvider
import parser.xml.GenericRssParser
import parser.json.providers.ScoopitWallParser

object Configuration {

  object Twitter {

    object wall extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/statuses/home_timeline.json?count=:limit")
      override val since = "&since_id=:since"//ID
      override val delay = 80
      override val provider = providers.Twitter
      override val parser = Some(TwitterTimelineParser)
    }
    object user extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/statuses/user_timeline.json?count=:limit&screen_name=:username")
      override val since = wall.since
      override val delay = 80
      override val provider = providers.Twitter
      override val requiredParams = List("username")
      override val parser = Some(TwitterTimelineParser)
      override val mustBeReordered = true
    }
    object hashtag extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/search/tweets.json?count=:limit&result_type=mixed&q=%23:hashtag")
      override val since = wall.since
      override val delay = 80
      override val provider = providers.Twitter
      override val requiredParams = List("hashtag")
      override val parser = Some(TwitterHashtagParser)
      override val mustBeReordered = true
    }
    object directMessage extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/direct_messages.json?count=:limit")
      override val since = wall.since
      override val delay = 80
      override val provider = providers.Twitter
      override val parser = Some(TwitterDirectMessageParser)
    }
    object messageToMe extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/statuses/mentions_timeline.json?count=:limit")
      override val since = "&since_id=:since"//ID
      override val delay = 80
      override val provider = providers.Twitter
      override val parser = Some(TwitterTimelineParser)
    }
    object connect extends EndpointConfig {
      override val url = "https://api.twitter.com/1.1/friends/ids.json"
      override val delay = 80
      override val provider = providers.Twitter
      //override val parser = Some(TwitterConnectParser)//more complexe than expected
    }
  }

  object Facebook {
    object wall extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/me/home?limit=:limit")
      override val since = "&since=:since"
      override val delay = 30
      override val provider = providers.Facebook
      override val parser = Some(FacebookWallParser)
      override val mustBeReordered = true
    }
    object user extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/:username/feed?limit=:limit")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Facebook
      override val requiredParams = List("username")
      override val parser = Some(FacebookWallParser)
      override val mustBeReordered = true
    }
    object group extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/:groupId/feed?limit=:limit")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Facebook
      override val requiredParams = List("groupId")
      override val parser = Some(FacebookWallParser)
      override val mustBeReordered = true
    }
    object message extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/me/inbox?limit=:limit")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Facebook
      override val parser = Some(FacebookInboxParser)
      override val mustBeReordered = true
    }
  }

  object Viadeo {
    object wall extends EndpointConfig {
      override val limit = 30
      override val url = withLimit("https://api.viadeo.com/me/smart_news.json?limit=:limit")
      override val since = "&since=:since"
      override val provider = providers.Viadeo
      override val parser = Some(ViadeoWallParser)
    }
  }

  object Linkedin {
    object wall extends EndpointConfig {
      override val url = withLimit("http://api.linkedin.com/v1/people/~/network/updates?count=:limit")
      override val manualNextResults = true // double result bug
      override val since = "&after=:since"
      override val provider = providers.LinkedIn
      override val parser = Some(LinkedInWallParser)
    }
  }

  object GooglePlus {
    object wall extends EndpointConfig {
      override val url = withLimit("https://www.googleapis.com/plus/v1/people/me/activities/public?maxResults=:limit")
      override val manualNextResults = true // Fuck Google+, there is no "since" key... Must be handle in actor with cache...
      override val provider = providers.GooglePlus
      override val parser = Some(GoogleplusWallParser)
    }
    object user extends EndpointConfig {
      override val url = withLimit("https://www.googleapis.com/plus/v1/people/:username/activities/public?maxResults=:limit")
      override val manualNextResults = true
      override val provider = providers.GooglePlus
      override val requiredParams = List("username")
      override val parser = Some(GoogleplusWallParser)
    }
  }

  object Github {
    object notifications extends EndpointConfig {
      override val url = "https://api.github.com/users/:username/received_events"
      override val manualNextResults = true
      override val provider = providers.GitHub
      override val requiredParams = List("username")
      override val parser = Some(GithubWallParser)
    }
  }

  object Trello {
    object notifications extends EndpointConfig {
      override val url = withLimit("https://api.trello.com/1/members/me/notifications?limit=:limit")
      override val since = "&since=:since" // id
      override val provider = providers.Trello
      override val parser = Some(TrelloWallParser)
    }
  }

  object StackOverflow {

  }

  object Scoopit {
    object wall extends EndpointConfig {
      override val url = withLimit("http://www.scoop.it/api/1/compilation?count=:limit")
      override val since = "&since=:since" // ts
      override val provider = providers.Scoopit
      override val parser = Some(ScoopitWallParser)
    }
  }
  
  object BetaSeries {
    object notifications extends EndpointConfig {
      override val url = withLimit("http://api.betaseries.com/members/notifications.json?number=:limit")
      override val since = "&last_id=:since" // id
      override val provider = providers.BetaSeries
      override val mustBeReordered = true
    }
    object planning extends EndpointConfig {
      override val url = "http://api.betaseries.com/planning/member.json"
      override val provider = providers.BetaSeries
      override val manualNextResults = true
      override val parser = Some(BetaseriesPlanningParser)
      override val delay = 600
    }
    object timeline extends EndpointConfig {
      override val url = withLimit("http://api.betaseries.com/timeline/friends.json?number=:limit")
      override val provider = providers.BetaSeries
      override val manualNextResults = true
      override val mustBeReordered = true
      override val parser = Some(BetaseriesTimelineParser)
      override val delay = 600
    }
  }
  object Rss {
    object rss extends EndpointConfig {
      override val url = ":url"
      override val requiredParams = List("url")
      override val provider = RssProvider
      override val manualNextResults = true
      override val mustBeReordered = true
      override val parser = Some(GenericRssParser)
      override val delay = 500
    }
  }
}


trait EndpointConfig {
  val url: String
  val since: String = ""
  val delay: Int = 60
  val provider: GenericProvider
  val requiredParams : List[String] = List.empty
  val limit = 20
  val manualNextResults = false
  val parser: Option[GenericParser] = None
  val mustBeReordered = false

  def withLimit(url: String) = url.replace(":limit", limit.toString)
}