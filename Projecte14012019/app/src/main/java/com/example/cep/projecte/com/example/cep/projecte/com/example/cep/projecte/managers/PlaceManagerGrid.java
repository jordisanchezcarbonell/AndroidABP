package com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.adapters.Adapter;

import java.util.ArrayList;
/* ----------------------------------------------------------------------------
* Funcio: getPlaces()
* Parametres: Ninguno
* Descripcio: Aqui es donde añadiremos las imagenes que quereos mostrar

* ------------------------------------------------------------------------- */
public class PlaceManagerGrid
{

	public static ArrayList<Adapter> getPlaces(){

	ArrayList<Adapter> imgAdapter = new ArrayList<>();

	imgAdapter.add(new Adapter(R.drawable.descuento,"Descuento"));
	imgAdapter.add(new Adapter(R.drawable.alquiler,"Alquiler"));
	imgAdapter.add(new Adapter(R.drawable.reserva,"Reserva"));
	imgAdapter.add(new Adapter(R.drawable.amigos,"Club Amigos"));

		return imgAdapter;
	}

}
