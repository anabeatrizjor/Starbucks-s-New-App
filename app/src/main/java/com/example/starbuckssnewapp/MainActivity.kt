package com.example.starbuckssnewapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import android.widget.ImageView
import com.example.starbuckssnewapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        // Open drawer when menuClick is clicked
        findViewById<ImageView>(R.id.menuClick).setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // To close the drawer
        navView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawerLayout.closeDrawers()

            when (menuItem.itemId) {
                R.id.settingsOnMenu -> {
                    val intent = Intent (this@MainActivity, SettingsMenuOption::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            true
        }
    }

    // coisinha da animação para abrir e fechar o menuzinho
    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}
