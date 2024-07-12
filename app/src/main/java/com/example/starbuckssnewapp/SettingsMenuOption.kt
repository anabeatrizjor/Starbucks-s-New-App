package com.example.starbuckssnewapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsMenuOption : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings_menu_option)
        
        val settingsBack = findViewById<ImageView>(R.id.backToTheMenuSettings)

        settingsBack.setOnClickListener {
            val intent = Intent(this@SettingsMenuOption, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}