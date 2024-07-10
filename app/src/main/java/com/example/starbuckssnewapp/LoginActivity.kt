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

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val emailInput = findViewById<EditText>(R.id.emailInputLogin)
        val passwordInput = findViewById<EditText>(R.id.passwordInputLogin)
        val newAccBtn = findViewById<Button>(R.id.ButtonCadastroLogin)
        val loginBtn = findViewById<EditText>(R.id.ButtonLoginLogin)
        val backArrow = findViewById<ImageView>(R.id.backArrowLogin)

        newAccBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, CadastroActivity::class.java)
            startActivity(intent)
            finish()
        }
        backArrow.setOnClickListener {
            val intent = Intent(this@LoginActivity, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }
        loginBtn.setOnClickListener {
            val emailLogin = emailInput.text.toString()
            val passwordLogin = passwordInput.text.toString()

            if (email == ){
                Toast.makeText(this@LoginActivity, "Login realizado com sucesso", Toast.LENGTH_SHORT).show()
                val intent = Intent (this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this@LoginActivity, "E-mail ou senha incorretos", Toast.LENGTH_SHORT).show()
            }

        }

    }

}