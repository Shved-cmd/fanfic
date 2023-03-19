package com.example.fanfic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fanfic.databinding.ActivityMainBinding
import com.example.fanfic.screens.home.Home_Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

// Добавить тост при клике на карточки


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // navigation
        bottom_nav_bar()

    }
    fun bottom_nav_bar() {
        val bottomNavBar = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        bottomNavBar.setupWithNavController(navController)
    }





}