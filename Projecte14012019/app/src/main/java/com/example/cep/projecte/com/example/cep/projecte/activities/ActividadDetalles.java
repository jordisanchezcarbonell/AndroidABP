package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;
import com.example.cep.projecte.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/* ============================================================================
 * Aplicacio: Classe ActividadDetalles
 * Arxiu: ActividadDetalles.java
 * Data de creacio: 18/10/2018
 * Descripcion: Contiene los metodos y atributos  especificos para ver cargar los atributos del json y mostrarlos
 * ========================================================================= */

public class ActividadDetalles extends MainToolBar {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad);
        String prueba;
        
  
        final ImageView imagen = (ImageView) findViewById(R.id.imagenActividad);
        final TextView titulo = (TextView) findViewById(R.id.tituloActividad);
        final TextView descripcion = (TextView) findViewById(R.id.descripcionActividad);
        final TextView nomLIb = (TextView) findViewById(R.id.libreriaNombre);
        final TextView recompensas = (TextView) findViewById(R.id.recompensaActividadPTS);
        final TextView fecha = (TextView) findViewById(R.id.fechaActividad);
        final TextView telefono = (TextView) findViewById(R.id.telefonoActividad);
        final TextView email = (TextView) findViewById(R.id.emailActividad);
        final TextView direccion = (TextView) findViewById(R.id.direccionActividad);
        final TextView experiencia = (TextView) findViewById(R.id.recompensaActividadEXP);
        final Button butonparticipar=(Button) findViewById(R.id.botonparticipar);

//Mostramos la action bar
        android.support.v7.widget.Toolbar actionbar = findViewById(R.id.actionbar);
       
        setSupportActionBar(actionbar);

//Mostramos la barra inferior
        barraInferior = findViewById(R.id.barra_inferior);
        barraInferior.setOnNavigationItemSelectedListener(this);

        
        final Actividad recibirAct =  (Actividad) getIntent().getSerializableExtra("ObjActividad");

// Cargamos el Json y en el catch mostramos el mensaje de error por si no lo carga bien.
        try
        {
            JSONObject jsonMain = new JSONObject(leerJson(R.raw.actividades));
            JSONArray itemsJSONArray = jsonMain.getJSONArray("Actividades");

            for (int i = 0; i < itemsJSONArray.length(); i++) {


                //Creamos un JSONObject de JSONArray
                JSONObject jsonObj = itemsJSONArray.getJSONObject(i);

                // Obtenemos el valos especifico de forma individual de JsonObject 

                final String nombreActividadJSON = jsonObj.getString("Nombre");
                String fechaActividad = jsonObj.getString("Fecha");
                String direccionActividad = jsonObj.getString("Ubicacion");
                String puntoseXP = jsonObj.getString("RecompensaEXP");
                String puntosR = jsonObj.getString("RecompensaPTS");
                String descripcionActividad = jsonObj.getString("Descripcion");
                String emailActividad = jsonObj.getString("email");
                String contactoActividad = jsonObj.getString("contacto");

                

                if(recibirAct.getNombre().equals(nombreActividadJSON))
                {
                    
                    //Variables--------VariableJson
                        //imagen.setImageDrawable();
                        titulo.setText(nombreActividadJSON);
                        fecha.setText(fechaActividad);
                        direccion.setText(direccionActividad);
                        experiencia.setText(puntoseXP);
                        descripcion.setText(descripcionActividad);
                        recompensas.setText(puntosR);

                        //imagen.setImageResource(imagenactividad);

                        email.setText(emailActividad);
                        telefono.setText(contactoActividad);
                }
            }
        }
        catch (IOException | JSONException exception)
        {
            Log.e(ActividadDetalles.class.getName(), "Error al cargar JSON", exception);
        }
/* ----------------------------------------------------------------------------
* Funcion: setOnItemClickListener
* Parametres: AdapterView<?> adapterView, View view, int i, long l
* Descripcion: Aqui programamos la funcion setOnItemClickListener para que cuando el usuario de al boton aparezca un mensaje.
* ------------------------------------------------------------------------- */

        butonparticipar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActividadDetalles.this, "Apuntado!", Toast.LENGTH_SHORT).show();
            }
        });
    }

 /* ----------------------------------------------------------------------------
* Funcio: leerJson
* Parametres: int rutaJSON
* Descripcio: Método para poder leer el JSON de librerias.json.

* ------------------------------------------------------------------------- */
    public String leerJson(int rutaJSON) throws IOException
    {
        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder();

        try
        {
            String jsonDataString = null;
            inputStream = getResources().openRawResource(rutaJSON);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream, "UTF-8"));
            while ((jsonDataString = bufferedReader.readLine()) != null){
                builder.append(jsonDataString);
            }
        } finally {
            if (inputStream != null){
                inputStream.close();
            }
        }

        return new String(builder);
    }

}

