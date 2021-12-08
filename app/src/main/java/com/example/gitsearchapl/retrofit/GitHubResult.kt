package com.example.gitsearchapl.retrofit

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GitHubResult (
    @Json(name="name")
    var ResultSearch: String,
    @Json(name="url")
    var ResultUrl: String)