package com.example.auladevmobile


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class CadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad)
        val butCad : Button = findViewById(R.id.bt_ConfirmarCad)

        butCad.setOnClickListener{
            val endereco = findViewById(R.id.editTextEndereco) as EditText
            val cep = findViewById(R.id.editTextCEP) as EditText
            val nome = findViewById(R.id.editTextNome) as EditText
            val numero = findViewById(R.id.editTextNumeroRes) as EditText
            //val complemento = findViewById(R.id.editTextComplemento) as EditText
            val senha : EditText = findViewById(R.id.editTextPassword)
            val confSenha :EditText =findViewById(R.id.editTextPasswordConfirm)



            //validar campos do formulario obrigatórios
            if (TextUtils.isEmpty(nome.text)){
                Toast.makeText(this,"Endereço não digitado",Toast.LENGTH_LONG).show()
            }
            if (TextUtils.isEmpty(cep.text)){
                Toast.makeText(this,"CEP não digitado",Toast.LENGTH_LONG).show()
            }else if (TextUtils.isEmpty(endereco.text)){
                Toast.makeText(this,"nome não digitado",Toast.LENGTH_LONG).show()
            }else if (TextUtils.isEmpty(numero.text)){
                Toast.makeText(this,"numero não digitado",Toast.LENGTH_LONG).show()
            }else if (TextUtils.isEmpty(senha.text)){
                Toast.makeText(this,"senha não digitado",Toast.LENGTH_LONG).show()
            }else if (TextUtils.isEmpty(confSenha.text)){
                Toast.makeText(this,"confirmação de senha não digitado",Toast.LENGTH_LONG).show()
            }else if (TextUtils.equals(senha.text,confSenha.text)){
                Toast.makeText(this, "Dados Cadastrados", Toast.LENGTH_LONG).show()
                finish()
            } else{
                Toast.makeText(this,"senhas não coincidem",Toast.LENGTH_LONG).show()
            }


        }
    }
}