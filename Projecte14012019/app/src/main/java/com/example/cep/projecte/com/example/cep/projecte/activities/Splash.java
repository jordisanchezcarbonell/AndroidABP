package com.example.cep.projecte.com.example.cep.projecte.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import com.example.cep.projecte.R;

/* ============================================================================
* Aplicació: Classe Splash
* Arxiu: Splash.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos y metodos especificos de la clase registro
* ========================================================================= */
public class Splash extends AppCompatActivity
{
	int i = 0;
	@Override

	protected void onCreate(@Nullable Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		try {

			VideoView videoHolder = new VideoView(this);
			setContentView(videoHolder);
			Uri video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash);
			videoHolder.setVideoURI(video);

 /* ----------------------------------------------------------------------------
* Funció: setOnCompletionListener
* Paràmetres: Ninguno
* Descripció: Al acabar el Splash se abre el Login , si no cargarse el splash tambien va a la pantalla de Login

* ------------------------------------------------------------------------- */  
			videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) { 
					abrirLogin();
				}
			});
			videoHolder.start();
		} catch (Exception ex) {
			jump();
		}
	}

 /* ----------------------------------------------------------------------------
* Funció: jump()
* Paràmetres: Ninguno
* Descripció: Espera aque acabe el Splah para lanzar la pantalla de Login

* ------------------------------------------------------------------------- */  
	private void jump() {
		if (isFinishing())
			return;
		startActivity(new Intent(this, MainActivity.class));
		finish();
	}

 /* ----------------------------------------------------------------------------
* Funció: abrirLogin()
* Paràmetres: Ninguno
* Descripció: Abre la pantalla de Login

* ------------------------------------------------------------------------- */  
	public void abrirLogin() {

		Intent intent = new Intent(this, MainActivity.class);
		//Se inicia la actividad;
		startActivity(intent);
	}

}
