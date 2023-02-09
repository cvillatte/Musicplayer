package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //creating a new media player object
   val mediaPlayer :MediaPlayer! = MediaPlayer.create(this,R.raw.music)
        //creating play button
        play_btn.setOnClickListener {

     }
    }

}