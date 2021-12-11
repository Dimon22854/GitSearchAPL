package com.example.gitsearchapl.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.Query
import com.google.firebase.database.core.Repo
import retrofit2.http.Headers
import retrofit2.http.Path

//@GET("search/repositories?q={repositories}")
//https://api.github.com/search/repositories?q=sql
interface GitHubService {
    @GET("repositories")
    //fun getListRepository(): Call<List<GitHubResult>>
    fun getListRepository(@Query("q") repositories: String): Call<List<GitHubResult>>

    /*companion object {

        var BASE_URL = "https://api.github.com/"

        fun create() : GitHubService {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(MoshiConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(GitHubService::class.java)

        }
    }*/
}
/*@GET("api.php?company_name={name}")
    Call<Model> getRoms_center(@Query("name") String name);*/

/*@GET("api.php")
Call<Model> getRoms_center(@Query("company_name") String name);*/