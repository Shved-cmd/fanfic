package com.example.fanfic.adapter

import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R

class Horizontal_RecCler_View(private val cardWidth: Int): RecyclerView.Adapter<Horizontal_RecCler_View.MyViewHolder>() {

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {


        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)



        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

}