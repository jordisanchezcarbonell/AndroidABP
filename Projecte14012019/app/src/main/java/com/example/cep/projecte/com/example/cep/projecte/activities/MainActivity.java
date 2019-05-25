package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.widget.Toolbar;

import com.example.cep.projecte.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		final EditText nombreUsuario = (EditText) findViewById(R.id.editTextNombreLogin);
		final TextInputLayout textInputLayoutPasswordLogin = (TextInputLayout) findViewById(R.id.textInputLayoutPasswordLogin);
		final Button buttonEntrar = (Button) findViewById(R.id.buttonEntrar);
		final TextView textViewOlvidadoPassword = (TextView) findViewById(R.id.textViewOlvidadoPassword);
		final Button buttonRegistro = (Button) findViewById(R.id.buttonRegistro);

	//Variables de nuestra grid Actividades;


		//Variable de nuestra ToolBar;
		final Toolbar perfil;

		Context context;
		solicitudPermisos();


		textViewOlvidadoPassword.setOnClickListener(new View.OnClickListener()
		{ // Toast para la recuperacion de contraseña
			@Override
			public void onClick(View v)
			{
				Toast.makeText(MainActivity.this,R.string.mailRecuperacion , Toast.LENGTH_SHORT).show();
			}
		});

		buttonEntrar.setOnClickListener(new View.OnClickListener()
		{ // Boton entrar
			@Override
			public void onClick(View v)
			{
				if (nombreUsuario.getText().toString().isEmpty() && textInputLayoutPasswordLogin.getEditText().getText().toString().equals(""))
				{ //Cap dada -.-
					Toast.makeText(MainActivity.this, R.string.introduceDatos, Toast.LENGTH_SHORT).show();
				} else if (nombreUsuario.getText().toString().isEmpty())
				{ // No name
					Toast.makeText(MainActivity.this, R.string.introduceNombre, Toast.LENGTH_SHORT).show();
				} else if (textInputLayoutPasswordLogin.getEditText().getText().toString().equals(""))
				{ // No password
					Toast.makeText(MainActivity.this, R.string.introduceContraseña, Toast.LENGTH_SHORT).show();
				} else
				{
					abrirActividades();
				}


			}
		});


		buttonRegistro.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				abrirRegistro();

			}
		});

		//Bundle recipiente = new Bundle();
		// recipiente = getIntent().getExtras();
		// String nombreUsuarioRecibido = recipiente.getString("nombreUsuarioRecibido");
		//nombreUsuario.setText(nombreUsuarioRecibido);

	}
    //Método para abir el registro;
        public void abrirRegistro(){
            Intent intent = new Intent(this,registro.class);
            startActivity(intent);

        }


    public  void aceptar(){

		Toast.makeText(MainActivity.this, R.string.bienvenido, Toast.LENGTH_SHORT).show();

	}


	public  void cancelar(){

		finish();
    }


    public  void solicitudPermisos(){
		//Creamos el AlertDialog para entrar en la App;
		AlertDialog.Builder alerta = new AlertDialog.Builder(this);
		alerta.setTitle("¿Permitir que Liber pueda acceder a fotos, contenido multimedia y archivos de su dispositivo?");
		alerta.setPositiveButton("Cancelar", new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialogInterface, int i)
			{
				cancelar();
			}
		});
		alerta.setCancelable(false);
		alerta.setNegativeButton("Aceptar", new DialogInterface.OnClickListener()
		{
			@Override
			public void onClick(DialogInterface dialogInterface, int i)
			{
				aceptar();
			}
		});

		alerta.show();
	}


	//Método para abrir las actividades de las librerias;
	public void abrirActividades(){
        Intent intentLibrerias = new Intent(this, ActividadesActivity.class);
        startActivity(intentLibrerias);
    }




}
