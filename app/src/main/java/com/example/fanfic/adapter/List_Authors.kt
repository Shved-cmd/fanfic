package com.example.fanfic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R
import org.w3c.dom.Text

class List_Authors: RecyclerView.Adapter<List_Authors.MyViewHolder>() {

    val names = arrayListOf<String>("Eblan2002", "MaximCool", "Vooohoo2")
    val sub = arrayListOf<String>("20M Subs", "10 Subs", "1 Sub")

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val names = itemView.findViewById<TextView>(R.id.names_text)
        val sub = itemView.findViewById<TextView>(R.id.sub)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_vertical, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
       return names.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.names.text = names[position]
        holder.sub.text = sub[position]
    }

}