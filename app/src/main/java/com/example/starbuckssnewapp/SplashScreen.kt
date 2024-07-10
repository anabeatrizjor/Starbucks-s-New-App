package com.example.starbuckssnewapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreen : AppCompatActivity() {

    private val splashScreenStarted = 2000

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash_screen)

        val logoView = findViewById<ImageView>(R.id.logo)
        val animView = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, WelcomeScreen::class.java)
            startActivity(intent)
            finish()
        }, splashScreenStarted.toLong())
    }
}