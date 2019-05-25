package com.example.cep.projecte.com.example.cep.projecte.activities;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.cep.projecte.com.example.cep.projecte.adapters.Adapter;
import com.example.cep.projecte.com.example.cep.projecte.adapters.PlaceAdapterGrid;
import com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers.PlaceManagerGrid;
import com.example.cep.projecte.R;

import java.util.ArrayList;
/* ============================================================================
* Aplicacio: Classe PerfilActivity
* Arxiu: PerfilActivity.java
* Data de creacio: 18/10/2018
* Descripcion: Contiene los metodos , atributos especificos y una gridView con opciones
* ========================================================================= */
public class PerfilActivity extends MainToolBar
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile2);

        Toolbar actionbar = findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);

        barraInferior = findViewById(R.id.barra_inferior);
        barraInferior.setOnNavigationItemSelectedListener(this);

        TextView textViewGridActividades = findViewById(R.id.textGridRecompensas);
        final GridView gridView = findViewById(R.id.idGridView);

        final ArrayList<Adapter> adapterGrids = PlaceManagerGrid.getPlaces();
        final PlaceAdapterGrid objGrid = new PlaceAdapterGrid(PerfilActivity.this, adapterGrids);

        //Seteamos desde nuestra GridView el objeto de tipo Adaptador para rellenar la Grid view;
        gridView.setAdapter(objGrid);
/* ----------------------------------------------------------------------------
* Funci�: setOnItemClickListener
* Par�metres: AdapterView<?> adapterView, View view, int i, long l
* Descripci�: Aqui programamos la funcion setOnItemClickListener para que cuando el usuario de a un elemento de la GrievView le lleve a la pantalla del menu selecionada

* ------------------------------------------------------------------------- */
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Adapter actividades = (Adapter) gridView.getItemAtPosition(i);

                if (actividades.getNombre().equals("Descuento"))
                {
                    Intent abrirDescuentos = new Intent(getApplicationContext(),QR.class);
                    startActivity(abrirDescuentos);

                } else if (actividades.getNombre().equals("Alquiler"))
                {

                    Intent abrirAlquiler = new Intent(getApplicationContext(),Alquiler.class);
                    startActivity(abrirAlquiler);

                } else if (actividades.getNombre().equals("Reserva"))
                {
                    Intent abrirReserva = new Intent(getApplicationContext(),Alquiler.class);
                    startActivity(abrirReserva);

                } else if (actividades.getNombre().equals("Club Amigos")) {

                    Toast.makeText(PerfilActivity.this, "Necesitas ser nivel 5 para desbloquear el Club de Amigos! FOREVER ALONE :(", Toast.LENGTH_LONG).show();

                }
            }
        });


        gridView.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent)
            {
                return motionEvent.getAction() == MotionEvent.ACTION_MOVE;

            }
        });

    }
/* ----------------------------------------------------------------------------
* Funci�: updateNavigationBarState()
* Par�metres: Ninguno
* Descripci�: Estos metodos sirven para marcar el boton que esta selecionado con la activtat selecionada , si no cambia de actividad y no se ve el boton marcado de la barra inferior

* ------------------------------------------------------------------------- */
    int getContentViewId() {return R.layout.profile2;}
  /* ----------------------------------------------------------------------------
* Funci�: getNavigationMenuItemId()
* Par�metres: Ninguno
* Descripci�: Estos metodos sirven para marcar el boton que esta selecionado con la activtat selecionada , si no cambia de actividad y no se ve el boton marcado de la barra inferior

* ------------------------------------------------------------------------- */
    int getNavigationMenuItemId() {
        return R.id.nav_perfil;
    }

}