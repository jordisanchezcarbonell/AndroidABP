package com.example.cep.projecte.com.example.cep.projecte.activities;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import com.example.cep.projecte.R;
import com.google.gson.JsonArray;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/* ============================================================================
* Aplicació: Classe registro
* Arxiu: registro.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos y metodos especificos de la clase registro
* ========================================================================= */
public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        final CheckBox checkBoxTerminos = (CheckBox) findViewById(R.id.terminos);
        final CheckBox checkBoxNotificaiones = (CheckBox) findViewById(R.id.notificaciones);
        final Button buttonRegistrarme = (Button) findViewById(R.id.registrarme);
        final EditText nombreUsuario = (EditText) findViewById(R.id.EditNombreUsuario);
        final EditText nombre = (EditText) findViewById(R.id.EditNombre);
        final EditText apellido = (EditText) findViewById(R.id.EditApellido);
        final EditText email = (EditText) findViewById(R.id.EditEmail);
        final EditText repEmail = (EditText) findViewById(R.id.EditEmailRep);
        final TextInputLayout contraseña = (TextInputLayout) findViewById(R.id.textInputLayoutPassword);
        final TextInputLayout repContraseña = (TextInputLayout) findViewById(R.id.textInputLayoutPasswordRep);

        


        buttonRegistrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
 /* ----------------------------------------------------------------------------
* Funció: onClick
* Paràmetres: Ninguno
* Descripció: Valida si todo los campots introducidos por el usuario son correctos

* ------------------------------------------------------------------------- */
                if (nombreUsuario.getText().toString().equals("") || nombre.getText().toString().equals("") ||
                        apellido.getText().toString().equals("") || email.getText().toString().equals("") ||
                        repEmail.getText().toString().equals("") || contraseña.getEditText().getText().toString().equals("") ||
                        repContraseña.getEditText().getText().toString().equals("")) {

                    Toast.makeText(registro.this, R.string.introduceDatos, Toast.LENGTH_SHORT).show();
                    }

                    else if (email.getText().toString().equals(repEmail.getText().toString())){
                        contraseña.setError(null); // Quitar los errores si los hay
                        email.setError(null); // Quitar los errores si los hay
                        if (contraseña.getEditText().getText().toString().equals(repContraseña.getEditText().getText().toString())) {

                            if (checkBoxTerminos.isChecked()) {
                                //Lanza el metodo abrirLogin.
                                abrirLogin(nombreUsuario);
                            } else {
                                Toast.makeText(registro.this, R.string.AceptarTerminosCondiciones, Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            contraseña.setError(getString(R.string.contraseñasNo));
                        }
                    }

                    else{
                    email.setError(getString(R.string.mailsno));
                }

            }
        });


//Guarda en un Json (el nombre de usuaro,nombre,apellido,email,contraseña)        
        try {
            escribirJSON(nombreUsuario,nombre,apellido,email,contraseña);
            Toast.makeText(this, "exito", Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

 /* ----------------------------------------------------------------------------
* Funció: abrirLogin(EditText editText)
* Paràmetres: Ninguno
* Descripció: Abre la pantalla de Login

* ------------------------------------------------------------------------- */    
    public void abrirLogin(EditText editText) {

        Intent intent = new Intent(this, MainActivity.class);
        //Se inicia la actividad;
        startActivity(intent);
    }
 /* ----------------------------------------------------------------------------
* Funció: escribirJSON(EditText nombre_usuario,EditText nombre, EditText apellido, EditText email, TextInputLayout contraseña)
* Paràmetres: EditText nombre_usuario,EditText nombre, EditText apellido, EditText email, TextInputLayout contraseña
* Descripció: Se pasa por parametros los datos indicados y los guarda en un fichero Json indicado

* ------------------------------------------------------------------------- */  
   public void escribirJSON(EditText nombre_usuario,EditText nombre, EditText apellido, EditText email, TextInputLayout contraseña) throws JSONException {

       JSONObject jsonObject = new JSONObject();
       jsonObject.put("nombre_usuario",nombre_usuario);
       jsonObject.put("nombre",nombre);
       jsonObject.put("apellido",apellido);
       jsonObject.put("email",email);
       jsonObject.put("contraseña",contraseña);

       JsonArray jsonElements = new JsonArray();
       jsonElements.add("Registro");
       jsonObject.put("Usuarios",jsonElements);

       try(FileWriter file = new FileWriter("usuarios.json")){

       file.write(jsonObject.toString());
       file.flush();

       } catch (IOException e) {
           e.printStackTrace();
       }

   }

}