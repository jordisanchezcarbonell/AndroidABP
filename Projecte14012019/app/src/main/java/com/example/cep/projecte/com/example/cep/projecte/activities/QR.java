package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cep.projecte.R;

/* ============================================================================
* Aplicació:Classe QR 
* Arxiu: QR.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos especificos de la clase QR
* ========================================================================= */
public class QR extends AppCompatActivity
{

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.qr);

		Button botonAceptar  = findViewById(R.id.btnAceptar);
		Button botonCancelar = findViewById(R.id.btnCancelar);

/* ----------------------------------------------------------------------------
* Funció: setOnItemClickListener
* Paràmetres: Ninguno
* Descripció: A la hora de clickear una opcion sale un mensaje.

* ------------------------------------------------------------------------- */
		botonAceptar.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Toast.makeText(QR.this, "Se ha habilitado la lectura del QR", Toast.LENGTH_SHORT).show();
			}
		});


		botonCancelar.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View view)
			{
				Toast.makeText(QR.this, "Se ha deshabilitado la lectura del QR", Toast.LENGTH_SHORT).show();
				finish();
			}
		});

	}





}
