package com.example.quickredditkotlin

class IConstants {
    class DB{
        companion object {
            const val DATABASE_NAME = "sunflower-db"
        }
    }

    class IDENTIFFIERS {
        companion object {
            @JvmField val ACTION = "action"
            @JvmField val SUBREDDIT = "subreddit"
        }
    }

    class ACTIONS {
        companion object {
            @JvmField val INIT = "init"
            @JvmField val ADD_SUBREDDIT = "add"
            @JvmField val PERIODIC_SYNC = "sync"
            @JvmField val WIDGET = "widget"
        }
    }

    class INTENT_EXTRAS {
        companion object {
            @JvmField val TYPE = "type"
            @JvmField val JSON_STRING = "json_string"
            @JvmField val POSTS_TYPE = "posts_type"
            @JvmField val START_ID = "start_id"
        }
    }

    class STATUS {
        companion object {
            @JvmField val SUCCESS = 0
            @JvmField val ERROR = 11
        }
    }

    class POST_TYPE {
        companion object {
            @JvmField val POST_TYPE_PREF_KEY = "post_type"

            @JvmField val HOT = 0
            @JvmField val NEW = 1
            @JvmField val TOP = 2
        }
    }

    class BROADCAST_MESSAGES {
        companion object {
            @JvmField val SUBREDDIT_UPDATE = "subreddit_update"
        }
    }

    class LEFT_NAV_TAGS {
        companion object {
            @JvmField val MAIN_PAGE = "main_page"
            @JvmField val SUBREDDIT_FEED = "subreddit_feed"
            @JvmField val ADD_SUBREDDIT = "add_subreddit"
            @JvmField val SETTINGS = "settings"
        }
    }

    class REDDIT_URL {
        companion object {
            @JvmField val BASE_URL = "https://www.reddit.com"
            @JvmField val BASE_URL_OAUTH = "https://oauth.reddit.com"

            @JvmField val SUBURL_HOT = "/hot"
            @JvmField val SUBURL_NEW = "/new"
            @JvmField val SUBURL_TOP = "/top"
            @JvmField val SUBURL_SEARCH_NAMES = "/api/search_reddit_names"
            @JvmField val SUBURL_GET_TOKEN = "/api/v1/access_token"

            @JvmField val SUBURL_JSON = ".json"

            @JvmField val PARAMS_SEPARATOR = "?"
            @JvmField val LIMIT_PARAM = "limit=1"
            @JvmField val COMMENTS_LIMIT_PARAM = "limit=50"
            @JvmField val COMMENTS_DEPTH_PARAM = "depth=4"

            @JvmField val REDIRECT_URI = "redirect_uri"
            @JvmField val DEVICE_ID = "device_id"
            @JvmField val EXACT = "exact"
            @JvmField val OVER_18 = "include_over_18"
            @JvmField val QUERY = "query"
            @JvmField val GRANT_TYPE = "grant_type"
            @JvmField val ACCESS_TOKEN = "access_token"
        }
    }

    class AUTH_PARAMS {
        companion object {
            @JvmField val USER_AGENT = "android:com.aggarwalankur.capstone.quickreddit:v1.0.0 (by /u/Ankur_Aggarwal)"
            @JvmField val CLIENT_ID = "zkqr3uaDu5eWOQ"
            @JvmField val CLIENT_SECRET = ""
            @JvmField val REDIRECT_URI = "quickreddit://com.aggarwalankur.capstone.quickreddit"
            @JvmField val GRANT_TYPE = "https://oauth.reddit.com/grants/installed_client"
        }
    }
}