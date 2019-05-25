package com.example.cep.projecte.com.example.cep.projecte.activities;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.activities.ActividadDetalles;
import com.example.cep.projecte.com.example.cep.projecte.activities.MainToolBar;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* ============================================================================
* Aplicació: Classe LibreriaDetalles
* Arxiu: LibreriaDetalles.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ver cargar los atributos del json y mostrarlos. Tambien el maps y la pagina web de cada libreria
* ========================================================================= */
public class LibreriaDetalles extends MainToolBar {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libreria_detalles);



		final ImageView imagenlib = (ImageView) findViewById(R.id.imagenLibreria);
		final TextView nombrelib = (TextView) findViewById(R.id.nombreLibreria);
		final TextView descripcionlib = (TextView) findViewById(R.id.descripcionLibreria);
		final TextView horariolib = (TextView) findViewById(R.id.horariolibLibreria);
		final TextView telf = (TextView) findViewById(R.id.telfLibreria);
		final TextView weblib = (TextView) findViewById(R.id.webLibreria);
		final TextView direccionlib = (TextView) findViewById(R.id.direccionLibreria);
		final Button maps = findViewById(R.id.maps);

		Toolbar actionbar = findViewById(R.id.actionbar);
		setSupportActionBar(actionbar);


		barraInferior = findViewById(R.id.barra_inferior);
		barraInferior.setOnNavigationItemSelectedListener(this);

		final Libreria recibirLibreria = (Libreria) getIntent().getSerializableExtra("ObjLibreria");


        //Método para acceder a la ubicación de nuestra libreria a traves del nombre.
        
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nombrelib.equals("Llibreria Paulinas")) {
                    Uri intentUri = Uri.parse("geo:41.3896221,2.173924100000022?z=16&q=41.3896221,2.173924100000022(Libreria Paulinas)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Abacus cooperativa")) {
                    Uri intentUri = Uri.parse("geo:41.390744,2.1749979999999596?z=16&q=41.390744,2.1749979999999596(Abacus)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Casa del Libro")) {
                    Uri intentUri = Uri.parse("geo:41.3897054,2.1649409000000333?z=16&q=41.3897054,2.1649409000000333(Casa del libro)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Troa Garbí")) {
                    Uri intentUri = Uri.parse("geo:41.3963089,2.1548857000000226?z=16&q=41.3963089,2.1548857000000226(Troa Garbí)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Ediciones Lebon")) {
                    Uri intentUri = Uri.parse("geo:41.3953284,2.165690400000017?z=16&q=41.3953284,2.165690400000017(Ediciones Lebon)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Aldarull")) {

                    Uri intentUri = Uri.parse("geo:41.4006251,2.159371800000031?z=16&q=41.4006251,2.159371800000031(Aldarull)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("Llibreria de la diputacio")) {
                    Uri intentUri = Uri.parse("geo:41.3958067,2.1576301000000058?z=16&q=41.3958067,2.1576301000000058(Llibreria de la diputacio)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("ReRead")) {
                    Uri intentUri = Uri.parse("geo:41.391312,2.1548852999999326?z=16&q=41.391312,2.1548852999999326(ReRead)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else if (nombrelib.getText().equals("La Central")) {
                    Uri intentUri = Uri.parse("geo:41.3989822,2.155211799999961?z=16&q=41.3989822,2.155211799999961(La Central)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                } else {
                    Uri intentUri = Uri.parse("geo:42.1012595,1.8439220999999861?z=16&q=42.1012595,1.8439220999999861(Berga)");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }

            }
        });

        //Método para poder acceder a la URL de nuestra libreria dependiendo del nombre.
        weblib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nombrelib.getText().equals("Llibreria Paulinas")){
                    Uri intentUri = Uri.parse("https://barcelona.paulinas.es/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Abacus cooperativa")){
                    Uri intentUri = Uri.parse("https://abacus.coop/ca/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Casa del Libro")){
                    Uri intentUri = Uri.parse("https://www.casadellibro.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Troa Garbí")){
                    Uri intentUri = Uri.parse("https://www.troa.es/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Ediciones Lebon")){
                    Uri intentUri = Uri.parse("https://www.lebon-libros.com/web_home.php");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Aldarull")){

                    Uri intentUri = Uri.parse("https://www.aldarull.org/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if (nombrelib.getText().equals("Llibreria de la diputacio")){
                    Uri intentUri = Uri.parse("https://www1.diba.cat/llibreria/Publicacions_Llibreria.asp");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if(nombrelib.getText().equals("ReRead")){
                    Uri intentUri = Uri.parse("https://www.re-read.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }
                else if(nombrelib.getText().equals("La Central")){
                    Uri intentUri = Uri.parse("https://www.lacentral.com/");
                    Intent intent = new Intent(Intent.ACTION_VIEW, intentUri);
                    startActivity(intent);
                }

            }
        });

// Cargamos el Json y en el catch mostramos el mensaje de error por si no lo carga bien.
        try
        {
            JSONObject jsonMain = new JSONObject(leerJson(R.raw.librerias));
            JSONArray itemsJSONArray = jsonMain.getJSONArray("Librerias");

            for (int i = 0; i < itemsJSONArray.length(); i++) {


                //Creamos un JSONObject de JSONArray
                JSONObject jsonObj = itemsJSONArray.getJSONObject(i);

                // Obtenemos el valos especifico de forma individual de JsonObject 
                final String nombreLibreria = jsonObj.getString("nombre");
                String direccionLibreria = jsonObj.getString("Direccion");
                String descripcionLibreria = jsonObj.getString("descripcion");
                String horario = jsonObj.getString("horario");
                String telefono = jsonObj.getString("Contacto");
                String web = jsonObj.getString("paginaweb");



                if(recibirLibreria.getNombre().equals(nombreLibreria))
                {
                    //Variables--------VariableJson
                    nombrelib.setText(nombreLibreria);
                    direccionlib.setText(direccionLibreria);
                    descripcionlib.setText(descripcionLibreria);
                    //imageViewActividad.setImageResource(imagenID);
                    weblib.setText(web);
                    telf.setText(telefono);
                    horariolib.setText(horario);


                }
            }
        }
        catch (IOException | JSONException exception)
        {
            Log.e(ActividadDetalles.class.getName(), "Error al cargar JSON", exception);
        }






    }


/* ----------------------------------------------------------------------------
* Funció: leerJson
* Paràmetres: int rutaJSON
* Descripció: Método para poder leer el JSON de librerias.json.

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



