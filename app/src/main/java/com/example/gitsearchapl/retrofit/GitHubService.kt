package com.example.gitsearchapl.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface GitHubService {
    @GET("repositories")
    fun getListRepository(@Query("q") name: String): Call<List<GitHubResult>>
}
