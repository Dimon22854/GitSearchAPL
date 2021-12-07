package com.example.gitsearchapl.retrofit

import com.google.firebase.database.core.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Retrofit




interface GitHubService {
    @GET("search/repositories?q={query}")
    fun listRepos(@Path("user") user: String?): Call<MutableList<Repo?>?>?
}