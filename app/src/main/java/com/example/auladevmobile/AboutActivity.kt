package com.example.auladevmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btlink : Button = findViewById(R.id.btabout)
        btlink.setOnClickListener(){
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uninassau.edu.br/")))
        }
    }
}