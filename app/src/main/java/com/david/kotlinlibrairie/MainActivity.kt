package com.david.kotlinlibrairie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import android.widget.TextView
import java.time.LocalDate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.accueil -> {
                val Connection = Intent(this, MainActivity::class.java)
                startActivity(Connection)
                true
            }
            R.id.bibliotheque -> {
                val intentInscription = Intent(this, Bibliotheque::class.java)
                startActivity(intentInscription)
                true
            }
            R.id.ajoutLivre -> {
                val intentSup = Intent(this, AjoutLivre::class.java)
                startActivity(intentSup)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}