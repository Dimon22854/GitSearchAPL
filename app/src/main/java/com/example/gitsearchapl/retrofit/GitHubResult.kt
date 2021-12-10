package com.example.gitsearchapl.retrofit

import com.squareup.moshi.Json

data class GitHubResult (
    @Json(name = "html_url")
    val html_url: String,
    @Json(name = "name")
    val name: String
    )
/*
    "login": "mojombo",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://avatars.githubusercontent.com/u/1?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/mojombo",
    "html_url": "https://github.com/mojombo",
    "followers_url": "https://api.github.com/users/mojombo/followers",
    "following_url": "https://api.github.com/users/mojombo/following{/other_user}",
    "gists_url": "https://api.github.com/users/mojombo/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
    "organizations_url": "https://api.github.com/users/mojombo/orgs",
    "repos_url": "https://api.github.com/users/mojombo/repos",
    "events_url": "https://api.github.com/users/mojombo/events{/privacy}",
    "received_events_url": "https://api.github.com/users/mojombo/received_events",
    "type": "User",
    "site_admin": false
*/

/*{
      "id": 4793392,
      "node_id": "MDEwOlJlcG9zaXRvcnk0NzkzMzky",
      "name": "sqlmap",
      "full_name": "sqlmapproject/sqlmap",
      "private": false,
      "owner": {
        "login": "sqlmapproject",
        "id": 735289,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjczNTI4OQ==",
        "avatar_url": "https://avatars.githubusercontent.com/u/735289?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/sqlmapproject",
        "html_url": "https://github.com/sqlmapproject",
        "followers_url": "https://api.github.com/users/sqlmapproject/followers",
        "following_url": "https://api.github.com/users/sqlmapproject/following{/other_user}",
        "gists_url": "https://api.github.com/users/sqlmapproject/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/sqlmapproject/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/sqlmapproject/subscriptions",
        "organizations_url": "https://api.github.com/users/sqlmapproject/orgs",
        "repos_url": "https://api.github.com/users/sqlmapproject/repos",
        "events_url": "https://api.github.com/users/sqlmapproject/events{/privacy}",
        "received_events_url": "https://api.github.com/users/sqlmapproject/received_events",
        "type": "Organization",
        "site_admin": false
     }*/