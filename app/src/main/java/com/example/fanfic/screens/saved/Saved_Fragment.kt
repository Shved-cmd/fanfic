package com.example.fanfic.screens.saved

import android.os.Bundle
import android.util.DisplayMetrics
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.R
import com.example.fanfic.adapter.saved_adapter


class Saved_Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_saved_, container, false)
        val recyclerView = view?.findViewById(R.id.recycler_saved) as RecyclerView
        val layoutManager = LinearLayoutManager(activity)
        recyclerView.layoutManager = layoutManager
        val dispMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(dispMetrics)
        val screenWidth = dispMetrics.widthPixels
        val cardWidth = screenWidth / 3
        val numOfColumns = 3
        recyclerView.layoutManager = GridLayoutManager(requireContext(), numOfColumns)
        val adapter = saved_adapter(cardWidth)
        recyclerView.adapter = adapter


        return view
    }


}