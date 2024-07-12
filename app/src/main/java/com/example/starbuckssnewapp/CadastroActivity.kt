package com.example.starbuckssnewapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
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
        val loginBtn = findViewById<Button>(R.id.ButtonLoginCadastro)
        val backArrow = findViewById<ImageView>(R.id.backArrowCadastro)

        loginBtn.setOnClickListener {
            val intent = Intent(this@CadastroActivity,LoginActivity::class.java)
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

                // Log para verificar os usuários adicionados
                Log.d("CadastroActivity", "Usuário cadastrado: $newUser")

                Toast.makeText(this@CadastroActivity, "Cadastro realizado com sucesso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@CadastroActivity, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
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