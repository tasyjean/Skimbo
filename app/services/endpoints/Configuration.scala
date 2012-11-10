package services.endpoints

import services.auth.GenericProvider
import services.auth.providers

object Configuration {

  object Twitter {

    object wall extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/statuses/home_timeline.json?count=:limit")
      override val since = "&since_id=:since"
      override val delay = 60
      override val provider = providers.Twitter
    }
    object user extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/statuses/user_timeline.json?count=:limit&screen_name=:username")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Twitter
      override val requiredParams = List("username")
    }
    object hashtag extends EndpointConfig {
      override val url = withLimit("https://api.twitter.com/1.1/search/tweets.json?count=:limit&result_type=mixed&q=%23:hashtag")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Twitter
      override val requiredParams = List("hashtag")
    }
  }

  object Facebook {
    object wall extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/me/home?limit=:limit")
      override val since = "&since=:since"
      override val delay = 30
      override val provider = providers.Facebook
    }
    object user extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/:username/feed?limit=:limit")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Facebook
      override val requiredParams = List("username")
    }
    object group extends EndpointConfig {
      override val url = withLimit("https://graph.facebook.com/:groupId/feed?limit=:limit")
      override val since = wall.since
      override val delay = 30
      override val provider = providers.Facebook
      override val requiredParams = List("groupId")
    }
  }

  object Viadeo {
    object wall extends EndpointConfig {
      override val url = withLimit("https://api.viadeo.com/me/smart_news.json?limit=:limit")
      override val since = "&since=:since"
      override val provider = providers.Viadeo
    }
  }

  object Linkedin {
    object wall extends EndpointConfig {
      override val url = withLimit("http://api.linkedin.com/v1/people/~/network/updates?count=:limit")
      override val since = "&after=:since"
      override val provider = providers.LinkedIn
    }
  }

  object GooglePlus {
    object wall extends EndpointConfig {
      override val url = withLimit("https://www.googleapis.com/plus/v1/people/me/activities/public?maxResults=:limit")
      override val manualNextResults = true // Fuck Google+, there is no "since" key... Must be handle in actor with cache...
      override val provider = providers.GooglePlus
    }
  }

  object Github {
    object notifications extends EndpointConfig {
      override val url = "https://api.github.com/users/:username/received_events" // (default limit : 30)
      override val manualNextResults = true // Fuck too (http://developer.github.com/v3/#conditional-requests)
      override val provider = providers.GitHub
      override val requiredParams = List("username")
    }
  }

  object Trello {
    object notifications extends EndpointConfig {
      override val url = withLimit("https://api.trello.com/1/members/me/notifications?limit=:limit")
      override val since = "&since=:since" // id
      override val provider = providers.Trello
    }
  }

  object StackOverflow {

  }

  object Scoopit {
    object notifications extends EndpointConfig {
      override val url = "http://www.scoop.it/api/1/notifications"
      override val since = "?since=:since" // ts
      override val provider = providers.Scoopit
    }
  }
}


trait EndpointConfig {
  val url: String
  val since: String = ""
  val delay: Int = 60
  val provider: GenericProvider
  val requiredParams : List[String] = List.empty
  val limit = 50
  val manualNextResults = false

  def withLimit(url: String) = url.replace(":limit", limit.toString);
}