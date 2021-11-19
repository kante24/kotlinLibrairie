package com.david.kotlinlibrairie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.time.LocalDate

class Bibliotheque : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibliotheque)

        val livre : Livres = Livres ("Chapdelaine" ,"Hemon", "Tarbarnacle revue", 120, 9.99, LocalDate.parse("2020-01-02"), "Rangée A" );
        val livre2 : Livres = Livres ("Chapdelaine2" ,"Hemon", "Tarbarnacle revue", 120, 9.99, LocalDate.parse("2020-01-02"), "Rangée A" );
        val livr3 : Livres = Livres ("Chapdelaine3" ,"Hemon", "Tarbarnacle revue", 120, 9.99, LocalDate.parse("2020-01-02"), "Rangée A" );
        val arrayLivres : ArrayList<Livres> = ArrayList()
        arrayLivres.add(livre)
        arrayLivres.add(livre2)
        arrayLivres.add(livr3)
        val myListAdapter = LivreArrayAdapteur(this,arrayLivres)
        val listView = findViewById<ListView>(R.id.listViewLivre);
        listView.adapter = myListAdapter
    }
}