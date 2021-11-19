package com.david.kotlinlibrairie

import java.time.LocalDate

open class Livres (var titre : String, var auteur : String, var editeur : String, var nbPage : Int, var prix : Double, var anneePublication : LocalDate, var localisation : String)
{
    init {
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
        this.nbPage = nbPage;
        this.prix = prix;
        this.anneePublication = anneePublication;
        this.localisation = localisation;
    }
}