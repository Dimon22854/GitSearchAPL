package com.example.gitsearchapl.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Query


interface GitHubService {
    @GET("search/repositories?q={query}")
    fun getListRepository(@Query("q") query: String?): Call<List<GitHubResult?>?>?

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