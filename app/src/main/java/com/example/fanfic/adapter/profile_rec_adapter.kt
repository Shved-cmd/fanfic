package com.example.fanfic.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.core.view.drawToBitmap
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R


class profile_rec_adapter(private val context: Context): RecyclerView.Adapter<profile_rec_adapter.ViewHolder>() {

    val title = arrayListOf("My fanfics", "Subscriptions", "Edit profile", "Settings")
    val subtitle = arrayListOf("See and create your fanfics", "See your subscriptions ", "Edit your profile", "Configure app settings")
    val icon = arrayListOf<Int>(R.drawable.baseline_menu, R.drawable.baseline_groups_24, R.drawable.baseline_create_24, R.drawable.baseline_settings_24)


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.title)
        val subtitle = itemView.findViewById<TextView>(R.id.subtitle)

        var icon = itemView.findViewById<ImageView>(R.id.icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_card, parent, false)
        return  ViewHolder(view)

    }

    override fun getItemCount(): Int {
            return 4
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = title[position]
        holder.subtitle.text = subtitle[position]
        holder.icon.setImageDrawable(ContextCompat.getDrawable(context, icon[position]))
    }
}