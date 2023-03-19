package com.example.fanfic.screens.home

import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R
import com.example.fanfic.adapter.Horizontal_RecCler_View
import com.example.fanfic.adapter.List_Authors
import com.example.fanfic.databinding.FragmentHomeBinding


class Home_Fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_, container, false)
        val recyclerView = view?.findViewById(R.id.recycler_view_home) as RecyclerView
       val recyclerView2 = view.findViewById(R.id.list_authors) as RecyclerView


        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)
        val screeWidth  = displayMetrics.widthPixels
        val cardWidth = screeWidth / 3
        val numOfColumns = 3
        recyclerView.layoutManager = GridLayoutManager(requireContext(), numOfColumns)
        val adapter = Horizontal_RecCler_View(cardWidth)
        recyclerView.adapter = adapter


        val layoutManager2 = LinearLayoutManager(activity)
        recyclerView2.layoutManager = layoutManager2
        val adapter2 = List_Authors()
        recyclerView2.adapter = adapter2


        return view

    }





}