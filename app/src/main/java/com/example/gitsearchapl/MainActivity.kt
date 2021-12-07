package com.example.gitsearchapl

import android.graphics.Movie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gitsearchapl.retrofit.GitHubResult
import com.example.gitsearchapl.retrofit.GitHubService
import com.example.gitsearchapl.retrofit.RecyclerAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var recyclerAdapter: RecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.list_search)
        recyclerAdapter = RecyclerAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = recyclerAdapter


        val apiInterface = GitHubService.create().getListRepository("sql")

        //apiInterface.enqueue( Callback<List<Movie>>()
        /*apiInterface.enqueue( object : Callback<List<GitHubResult>> {
            override fun onResponse(call: Call<List<GitHubResult>>?, response: Response<List<GitHubResult>>?) {

                if(response?.body() != null)
                    recyclerAdapter.setMovieListItems(response.body()!!)
            }

            override fun onFailure(call: Call<List<Movie>>?, t: Throwable?) {

            }
        })*/


    }
}