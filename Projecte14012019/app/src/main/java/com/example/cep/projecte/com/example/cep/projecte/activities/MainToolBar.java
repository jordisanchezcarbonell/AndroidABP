package com.example.cep.projecte.com.example.cep.projecte.activities;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.cep.projecte.R;

/* ============================================================================
* Aplicacio: Classe MainToolBar
* Arxiu: MainToolBar.java
* Data de creacio: 18/10/2018
* Descripcion: Contiene los elementos de la toolbar
* ========================================================================= */
public class MainToolBar extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener
{
	protected BottomNavigationView barraInferior;
	Toolbar actionbar;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitymaintoolbar);

		Toolbar actionbar = findViewById(R.id.actionbar);
		setSupportActionBar(actionbar);
		actionbar.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.idioma_catalan));

		barraInferior = findViewById(R.id.barra_inferior);
		barraInferior.setOnNavigationItemSelectedListener(this);

	}
    /* ----------------------------------------------------------------------------
* Funcio: onStart()
* Parametres: Ninguno
* Descripcio: Ver que elemento selecionado esta en  BottomNavigationView.

* ------------------------------------------------------------------------- */
	@Override
	protected void onStart() {
		super.onStart();
		updateNavigationBarState();
	}

/* ----------------------------------------------------------------------------
* Funcio: onCreateOptionsMenu
* Parametres: MenuItem item
* Descripcio: Creamos el menu de opciones de nuestra actividad

* ------------------------------------------------------------------------- */
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menuactionbar, menu);
		return super.onCreateOptionsMenu(menu);
	}
/* ----------------------------------------------------------------------------
* Funcio: onOptionsItemSelected
* Parametres: MenuItem item
* Descripcio: Ver que actividad esta selecionada

* ------------------------------------------------------------------------- */
	public boolean onOptionsItemSelected(MenuItem item){

		return super.onOptionsItemSelected(item);
	}

/* ----------------------------------------------------------------------------
* Funcio: onNavigationItemSelected
* Parametres: MenuItem item
* Descripcio: Al clickear una opcion del menu envia a la actividad seleccionada

* ------------------------------------------------------------------------- */
	@Override
	public boolean onNavigationItemSelected(@NonNull MenuItem item)
	{
		switch (item.getItemId()){
			case R.id.nav_actividades:
				Intent intentAct = new Intent(this, ActividadesActivity.class);
				startActivity(intentAct);
				break;
			case R.id.nav_librerias:
				Intent intentLib = new Intent(this, LibreriasActivity.class);
				startActivity(intentLib);
				break;
			case R.id.nav_perfil:
				Intent intentPerf = new Intent(this, PerfilActivity.class);
				startActivity(intentPerf);
				break;
		}

		return true;
	}
/* ----------------------------------------------------------------------------
* Funcio: onPause
* Parametres: Ninguno
* Descripcio: Eliminar la transicion entre actividades para evitar el lanzamiento de la pantalla al tocar los elementos de navegacion inferiores

* ------------------------------------------------------------------------- */
	@Override
	public void onPause() {
		super.onPause();
		overridePendingTransition(0, 0);
	}
/* ----------------------------------------------------------------------------
* Funcio: updateNavigationBarState()
* Parametres: Ninguno
* Descripcio: Establecemos el elemento selecionado en BottomNavigationView.

* ------------------------------------------------------------------------- */

	private void updateNavigationBarState(){
		int actionId = getNavigationMenuItemId();
		selectBottomNavigationBarItem(actionId);
	}
  

	void selectBottomNavigationBarItem(int itemId) {
		MenuItem item = barraInferior.getMenu().findItem(itemId);
		if(item != null)
		{
			item.setChecked(true);
		}
	}
/* ----------------------------------------------------------------------------
* Funcio: getContentViewId()
* Parametres: Ninguno
* Descripcio: Estos metodos sirven para marcar el boton que esta selecionado con la activtat selecionada , si no cambia de actividad y no se ve el boton marcado de la barra inferior

* ------------------------------------------------------------------------- */
	int getContentViewId() {
		return 0;
	}
/* ----------------------------------------------------------------------------
* Funcio: getNavigationMenuItemId()
* Parametres: Ninguno
* Descripcio: Estos metodos sirven para marcar el boton que esta selecionado con la activtat selecionada , si no cambia de actividad y no se ve el boton marcado de la barra inferior

* ------------------------------------------------------------------------- */
	/* AQUESTS DOS METODES SERVEIXEN PERQUE ES MARQUI EL BOTO D'ABAIX QUE ESTA SELECCIONAT SI NO ES CAMBIA L'ACTIVITAT PERO NO MARCA EL BOTO DE LA BARRA INFERIOR*/
	int getNavigationMenuItemId() {
		return 0;
	}
}
