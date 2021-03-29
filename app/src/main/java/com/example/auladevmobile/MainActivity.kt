package com.example.auladevmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //gerando eventos com os butões
        val btlogin : Button = findViewById(R.id.bt_login)
        btlogin.setOnClickListener{
            telaLogin()
        }
        val btcad : Button = findViewById(R.id.btcad)
        btcad.setOnClickListener{
            telaCad()
        }
        val btsobre : Button = findViewById(R.id.btabout)
        btsobre.setOnClickListener{
            telaSobre()
        }


    }
    //criando funções para abrir novas activities
    private fun telaLogin(){
        val login = Intent (this,LoginActivity::class.java)
        startActivity(login)
    }
    private fun telaCad(){
        val cadastro = Intent (this,CadActivity::class.java)
        startActivity(cadastro)
    }
    private fun telaSobre(){

           Toast.makeText(this,"ok",Toast.LENGTH_LONG).show()
       //val sobre = Intent (this,AboutActivity::class.java)
        val teste = Intent(this,AboutActivity::class.java)
        startActivity(teste)
    }

}