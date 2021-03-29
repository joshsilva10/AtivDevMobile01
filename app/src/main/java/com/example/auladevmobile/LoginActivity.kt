package com.example.auladevmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val user = "aluno"
        val password = "1234"
        val btLogin: Button = findViewById(R.id.bt_entrar)

        btLogin.setOnClickListener {
            val textUser: EditText = findViewById(R.id.editTextLogin)
            val textPass: EditText = findViewById(R.id.editTextSenhaLogin)
            //validando Login
            if (TextUtils.equals(user, textUser.text)) {
                if (TextUtils.equals(password, textPass.text)) {
                    Toast.makeText(this, "Login Efetuado com Sucesso", Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(this, "Senha Inválida", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "usuário Inválido", Toast.LENGTH_LONG).show()
            }
        }
    }
}