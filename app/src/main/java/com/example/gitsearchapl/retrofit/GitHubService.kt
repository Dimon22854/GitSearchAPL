package com.example.gitsearchapl.retrofit

import com.google.firebase.database.core.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


interface GitHubService {
    @GET("search/repositories?q={query}")
    fun listRepos(@Path("query") query: String?): Call<MutableList<Repo?>?>?

    companion object {

        var BASE_URL = "https://api.github.com/"

        fun create() : GitHubService {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(GitHubService::class.java)

        }
    }
}