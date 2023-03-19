package com.example.fanfic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R

class saved_adapter(private val cardWidth: Int): RecyclerView.Adapter<saved_adapter.OnViewHolder>() {

    class OnViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

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