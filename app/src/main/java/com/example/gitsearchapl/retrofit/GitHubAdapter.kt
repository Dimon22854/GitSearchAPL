package com.example.gitsearchapl.retrofit


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gitsearchapl.R
import kotlinx.android.synthetic.main.recyclerview_adapter.view.*

class GitHubAdapter(val users: List<GitHubResult>) : RecyclerView.Adapter<GitHubAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ResultSearch: TextView = itemView.ResultSearch
        val ResultUrl: TextView = itemView.ResultUrl
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_adapter, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.ResultSearch.text = users[position].login
        holder.ResultUrl.text = users[position].id
    }

    override fun getItemCount() = users.size
}