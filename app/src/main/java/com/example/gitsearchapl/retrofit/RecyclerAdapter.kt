package com.example.gitsearchapl.retrofit

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gitsearchapl.R

class RecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    var resultList : List<GitHubResult> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_adapter,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.title.text = resultList.get(position).ResultSearch
        holder.id.text = resultList.get(position).ResultUrl
        /*Glide.with(context).load(movieList.get(position).id)
                .apply(RequestOptions().centerCrop())
                .into(holder.id)*/
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setMovieListItems(movieList: List<GitHubResult>){
        this.resultList = movieList;
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val title: TextView = itemView!!.findViewById(R.id.ResultSearch)
        val id: TextView = itemView!!.findViewById(R.id.ResultUrl)

    }
}