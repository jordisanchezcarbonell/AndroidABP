package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cep.projecte.com.example.cep.projecte.adapters.LibreriasAdapter;
import com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers.LibreriasManager;
import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

import java.util.ArrayList;
/* ============================================================================
* Aplicació: Classe LibreriasActivity
* Arxiu: LibreriasActivity.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ver la listview
            de las librerias.
* ========================================================================= */
public class LibreriasActivity extends MainToolBar
{
    Toolbar actionbar;
    private LibreriasAdapter adaptador;
    public static  final int LIBRERIAS_ACTIVITY  =  1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librerias);
//Declaramos la toolbar
        Toolbar actionbar = findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);

        final ListView LV2 = findViewById(R.id.LstLibrerias);
        final ArrayList<Libreria> librerias = LibreriasManager.getLibrerias();

//Declaramos la menuinferior.

        barraInferior = findViewById(R.id.barra_inferior);
        barraInferior.setOnNavigationItemSelectedListener(this);

        adaptador = new LibreriasAdapter(this, librerias);
        //Seteamos desde nuestra Listview  el objeto de tipo Adaptador para rellenar la Listview;

        LV2.setAdapter(adaptador);
/* ----------------------------------------------------------------------------
* Funció: setOnItemClickListener
* Paràmetres: AdapterView<?> adapterView, View view, int i, long l
* Descripció: Aqui programamos la funcion setOnItemClickListener para que cuando el usuario de a un elemento de la ListView le lleve a los detalles de ese elemento seleccionado

* ------------------------------------------------------------------------- */
        LV2.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Libreria libreria = (Libreria) LV2.getItemAtPosition(i);

                Intent intentActivity = new Intent(getApplicationContext(),LibreriaDetalles.class);
                intentActivity.putExtra("ObjLibreria",libreria);
                startActivityForResult(intentActivity,LIBRERIAS_ACTIVITY);
            }
        });


    }


/* ----------------------------------------------------------------------------
* Funció: getContentViewId
* Paràmetres: Ninguno
* Descripció:Estos dos metodos sirven para que se marquen el boton de abajo que esta selecionado, si no se cambia de actividad pero no marca la actividad del menu de abajo.

* ------------------------------------------------------------------------- */
    int getContentViewId() {
        return R.layout.activity_librerias;
    }
    /* AQUESTS DOS METODES SERVEIXEN PERQUE ES MARQUI EL BOTO D'ABAIX QUE ESTA SELECCIONAT SI NO ES CAMBIA L'ACTIVITAT PERO NO MARCA EL BOTO DE LA BARRA INFERIOR*/
    int getNavigationMenuItemId() {
        return R.id.nav_librerias;
    }


}