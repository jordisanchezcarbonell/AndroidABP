package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;
import com.example.cep.projecte.com.example.cep.projecte.adapters.ActividadesAdapter;
import com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers.ActividadesManager;
import com.example.cep.projecte.R;

import java.util.ArrayList;

/* ============================================================================
* Aplicació: Classe ActividadesActivity
* Arxiu: ActividadesActivity.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ver la listview
            de las actividades.
* ========================================================================= */
public class ActividadesActivity extends MainToolBar
{
    Toolbar actionbar;
    private ActividadesAdapter adaptador;
    public static  final int ACTIVIDADES_ACTIVITY  =  1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades);

        Toolbar actionbar = findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);

        final ListView TV1 = findViewById(R.id.LstActividades);
        final ArrayList<Actividad> actividad = ActividadesManager.getActividades();


        barraInferior = findViewById(R.id.barra_inferior);
        barraInferior.setOnNavigationItemSelectedListener(this);


        adaptador = new ActividadesAdapter(this, actividad);

        TV1.setAdapter(adaptador);
/* ----------------------------------------------------------------------------
* Funció: setOnItemClickListener
* Paràmetres: AdapterView<?> adapterView, View view, int i, long l
* Descripció: Aqui programamos la funcion setOnItemClickListener para que cuando el usuario de a un elemento de la ListView le lleve a los detalles de ese elemento seleccionado

* ------------------------------------------------------------------------- */

        TV1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Actividad actividad = (Actividad) TV1.getItemAtPosition(i);


                Intent intentActivity = new Intent(getApplicationContext(), ActividadDetalles.class);
                intentActivity.putExtra("ObjActividad", actividad);
                startActivityForResult(intentActivity, ACTIVIDADES_ACTIVITY);

            }
        });


    }


    int getContentViewId() {
        return R.layout.activity_actividades;
    }

    int getNavigationMenuItemId() {
        return R.id.nav_actividades;
    }

}

