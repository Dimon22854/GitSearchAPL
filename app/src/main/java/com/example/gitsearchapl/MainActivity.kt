package com.example.gitsearchapl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
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

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<GitHubResult>()

        for (i in 0..100){
            users.add(GitHubResult("1","Dima"))
        }

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
        val api = retrofit.create(GitHubService::class.java)

        api.getListRepository().enqueue( object : Callback<List<GitHubResult>>{
            override fun onResponse(
                call: Call<List<GitHubResult>>,
                response: Response<List<GitHubResult>>
            ) {
                showData(response.body()!!)
                //d("Dima", "onResponse: ${response.body()!![0].login}")
            }

            override fun onFailure(call: Call<List<GitHubResult>>, t: Throwable) {
                d("Dima", "onFailure")
            }
        })
    }

    private fun showData(users: List<GitHubResult>) {

        list_search.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = GitHubAdapter(users)

        }
    }


}

