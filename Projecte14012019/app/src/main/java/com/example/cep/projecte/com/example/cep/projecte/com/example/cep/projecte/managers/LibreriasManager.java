package com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers;


import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

import java.util.ArrayList;
    /* ============================================================================
* Aplicació: Classe LibreriasManager
* Arxiu: LibreriasManager.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los Arraylist de las Libreria con los valores que queremos mostrar.
* ========================================================================= */
 
public class LibreriasManager
{
    /* ----------------------------------------------------------------------------
* Funció: getLibrerias()
* Paràmetres: Ninguno
* Descripció: Tenmos los valores que queremos mostrar y añadir a la ArrayList.

* ------------------------------------------------------------------------- */
    public static ArrayList<Libreria> getLibrerias()
    {
        ArrayList<Libreria> librerias = new ArrayList<>();
        librerias.add(new Libreria("Llibreria Paulinas", "Ronda de Sant Pere, 19, 08010 Barcelona", "libreria.barcelona@paulinas.es", R.drawable.logolpautinas));
        librerias.add(new Libreria("Abacus cooperativa", "Carrer de Balmes, 163, 08008 Barcelona", "soci.client@abacus.coop", R.drawable.abacuscooperativa));
        librerias.add(new Libreria("Casa del Libro", "Rambla de Catalunya, 37, 08007 Barcelona", "ramblacatalunya@casadellibro.com", R.drawable.casadellibro));
        librerias.add(new Libreria("Troa Garbí", "Via Augusta, 9, 08006 Barcelona", "hola@gmail.com", R.drawable.logotroa));
        librerias.add(new Libreria("Ediciones Lebon", "Carrer de Roger de Llúria, 93, 08009 Barcelona", "edlebron@edlebron.com", R.drawable.logolebron));
        librerias.add(new Libreria("Aldarull", "Carrer del Torrent de l'Olla, 72, 08012 Barcelona", "editorial@aldarull.org", R.drawable.logoaldarull));
        librerias.add(new Libreria("Casa Anita Llibres", "Carrer de Vic, 14, 08006 Barcelona", "info@casaanitallibres.com", R.drawable.logocasaanita));
        librerias.add(new Libreria("Llibreria de la diputacio", "Avinguda Diagonal, 393, 08008 Barcelona", "llibreria@diba.cat", R.drawable.logollibreriadiputacio));
        librerias.add(new Libreria("ReRead", "Carrer del Rosselló, 158, 08036 Barcelona", "rossello@re-read.com", R.drawable.logoreread));
        librerias.add(new Libreria("La Central", "Carrer de Mallorca, 237, 08008 Barcelona", "administracio@lacentral.com", R.drawable.logolacentral));
        return librerias;
    }


}




