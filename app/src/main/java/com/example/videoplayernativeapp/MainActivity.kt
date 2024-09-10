package com.example.videoplayernativeapp

// to access to the filesystem
import android.net.Uri
import android.net.Uri.*
import android.widget.MediaController
import android.widget.VideoView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.videoplayernativeapp.databinding.ActivaityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  appBarConfiguration: AppBarConfiguration
    private lateinit var databinding: ActivaityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }

        val uri : Uri = parse("android.resource://" + packageName + "/" + "test")
    }
}
