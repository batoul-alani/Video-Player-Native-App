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
        databinding = ActivaityMainBinding.inflate(layoutInflater)
        setContentView(databinding.root)

        val videoView = findViewById<VideoView>(databinding.testView.id)
        // Creating MediaController
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        // Specify the location of the media file
        val uri : Uri = parse("android.resource://" + packageName + "/raw/" + "test")

        // Setting the mediaController and the URI then start the videoView
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}
