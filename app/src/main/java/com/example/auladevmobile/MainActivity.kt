package com.example.auladevmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btlogin : Button = findViewById(R.id.bt_login)
        btlogin.setOnClickListener{
            telaLogin()
        }
        val btcad : Button = findViewById(R.id.btcad)
        btcad.setOnClickListener{
            telaCad()
        }
        val btlink : Button = findViewById(R.id.btlink)
        btlink.setOnClickListener(){
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uninassau.edu.br/")))
        }

    }

    private fun telaLogin(){
        val login = Intent (this,LoginActivity::class.java)
        startActivity(login)
    }
    private fun telaCad(){
        val cadastro = Intent (this,CadActivity::class.java)
        startActivity(cadastro)
    }

}