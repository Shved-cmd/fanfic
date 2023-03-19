package com.example.fanfic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.inflate
import com.example.fanfic.R

class search_rec_adapter(private val cardWidth: Int): RecyclerView.Adapter<search_rec_adapter.OnViewHolder>() {

    class OnViewHolder(itemView: View) : ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.search_card, parent, false)
        return OnViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: OnViewHolder, position: Int) {

    }
}