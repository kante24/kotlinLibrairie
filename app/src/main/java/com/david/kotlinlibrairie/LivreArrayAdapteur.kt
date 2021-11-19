package com.david.kotlinlibrairie

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*

class LivreArrayAdapteur(private val context: Activity,var livres: ArrayList<Livres>)
    : ArrayAdapter<Livres>(context, R.layout.layout_livre, livres) {

    init {
        livres = livres
    }
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val tempLivre: Livres = livres[position]
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.layout_livre, parent, false)

        val titre = rowView.findViewById(R.id.lblTitre) as TextView
        val auteur = rowView.findViewById(R.id.lblNomAuteur) as TextView
        val prix = rowView.findViewById(R.id.lblPrix) as TextView
        val nbPage = rowView.findViewById(R.id.lblNbPage) as TextView
        val localisation = rowView.findViewById(R.id.lblLocalisation) as TextView
        val anneePub = rowView.findViewById(R.id.lblAnneePublication) as TextView
        val editeur = rowView.findViewById(R.id.lblEditeur) as TextView

        titre.text = "Titre = " + tempLivre.titre
        auteur.text = "Auteur = " +  tempLivre.auteur
        prix.text = "Prix = " +  tempLivre.prix.toString()
        nbPage.text = "Nombre de Pages = " +  tempLivre.nbPage.toString()
        localisation.text = "Localisation = " +  tempLivre.localisation
        anneePub.text = "Année Publication = " +  tempLivre.anneePublication.toString()
        editeur.text = "Editeur = " +  tempLivre.editeur

        return rowView
    }
}