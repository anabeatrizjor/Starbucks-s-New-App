package com.example.starbuckssnewapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CadastroActivity : AppCompatActivity() {

    data class User (val email:String , val senha:String)

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro)

        val emailInput = findViewById<EditText>(R.id.emailInputCadastro)
        val passwordInput = findViewById<EditText>(R.id.passwordInputCadastro)
        val cadastroBtn = findViewById<Button>(R.id.ButtonCadastroCadastro)
        val loginBtn = findViewById<EditText>(R.id.ButtonCadastroCadastro)
        val backArrow = findViewById<ImageView>(R.id.backArrowCadastro)

        loginBtn.setOnClickListener {
            val intent = Intent(this@CadastroActivity, CadastroActivity::class.java)
            startActivity(intent)
            finish()
        }
        backArrow.setOnClickListener {
            val intent = Intent(this@CadastroActivity, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }
        cadastroBtn.setOnClickListener {
            val emailCadastro = emailInput.text.toString()
            val passwordCadastro = passwordInput.text.toString()

            if (emailCadastro.isNotBlank() && passwordCadastro.isNotBlank()){
                val newUser = User(emailCadastro, passwordCadastro)
                listaUser.add(newUser)
                Toast.makeText(this@CadastroActivity, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@CadastroActivity, "Algo deu errado", Toast.LENGTH_SHORT).show()
            }
        }
    }
    companion object {
        var listaUser = mutableListOf<User>()
        fun getUsers(): List<User> {
            return listaUser
        }
    }
}