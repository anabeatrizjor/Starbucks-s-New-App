package com.example.starbuckssnewapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val logar = findViewById<Button>(R.id.ButtonLogar)
        val criar = findViewById<Button>(R.id.ButtonCriar)

        logar.setOnClickListener {
            val intent = Intent(this@WelcomeScreen, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        criar.setOnClickListener {
            val intent = Intent(this@WelcomeScreen, CadastroActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}