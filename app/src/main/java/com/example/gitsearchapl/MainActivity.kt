package com.example.gitsearchapl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gitsearchapl.retrofit.GitHubAdapter
import com.example.gitsearchapl.retrofit.GitHubResult
import com.example.gitsearchapl.retrofit.GitHubService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import okhttp3.Request
import okio.Timeout


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val users = mutableListOf<GitHubResult>()

        /*val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        val api = retrofit.create(GitHubService::class.java)

        btn_search.setOnClickListener {
            api.getListRepository("grit").enqueue(object : Call<List<GitHubResult>>,
                Callback<List<GitHubResult>> {
                override fun clone(): Call<List<GitHubResult>> {
                    TODO("Not yet implemented")
                }

                override fun execute(): Response<List<GitHubResult>> {
                    TODO("Not yet implemented")
                }

                override fun enqueue(callback: Callback<List<GitHubResult>>) {
                    TODO("Not yet implemented")
                }

                override fun isExecuted(): Boolean {
                    TODO("Not yet implemented")
                }

                override fun cancel() {
                    TODO("Not yet implemented")
                }

                override fun isCanceled(): Boolean {
                    TODO("Not yet implemented")
                }

                override fun request(): Request {
                    TODO("Not yet implemented")
                }

                override fun timeout(): Timeout {
                    TODO("Not yet implemented")
                }

                override fun onResponse(
                    call: Call<List<GitHubResult>>,
                    response: Response<List<GitHubResult>>
                ) {
                    showData(response.body()!!)
                    d("Data", "onResponse")
                }

                override fun onFailure(call: Call<List<GitHubResult>>, t: Throwable) {
                    d("Data", "onFailure")
                }
            })
        }


    }

    private fun showData(users: List<GitHubResult>) {

        list_search.apply {

            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = GitHubAdapter(users)

        }
    }*/
}}


