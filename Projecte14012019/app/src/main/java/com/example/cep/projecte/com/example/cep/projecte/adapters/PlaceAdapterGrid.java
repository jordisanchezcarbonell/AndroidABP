package com.example.cep.projecte.com.example.cep.projecte.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.activities.PerfilActivity;
import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;
import com.example.cep.projecte.com.example.cep.projecte.adapters.Adapter;

import java.util.ArrayList;
/* ============================================================================
 * Aplicacio: Classe PlaceAdapterGrid
 * Arxiu: PlaceAdapterGrid.java
 * Data de creacio: 18/10/2018
 * Descripcion: Contiene los metodos y atributos  especificos para enlazar los items con el layouts
 * ========================================================================= */
public class PlaceAdapterGrid extends ArrayAdapter
{
	private Context context;
	private ArrayList<Adapter> adapterGrids;
	private ArrayList<Actividad> listaActividades;


	public PlaceAdapterGrid(PerfilActivity context, ArrayList<Adapter> adapterGrids)
	{
		super(context, R.layout.imagenes_grid, adapterGrids);
		this.context = context;
		this.adapterGrids = adapterGrids;
	}

	public View getView (int position, View convertView, ViewGroup parent){
		//Enlazamos las Grid con el diseño del nuestro layout para las imagenes del menu
		LayoutInflater inflado = LayoutInflater.from(getContext());
		View item  = inflado.inflate(R.layout.imagenes_grid, null);

		//Enlazamos nuestro TextView con el diseño del LayoutPrincipal con el LayoutImagenes.
		TextView nombActividad = item.findViewById(R.id.textGridRecompensas);
		nombActividad.setText(adapterGrids.get(position).getNombre());

		//Enlazamos nuestro ImageView con el diseño.
		ImageView imgGridMenu = item.findViewById(R.id.imgGridRecompensas);
		imgGridMenu.setImageResource(adapterGrids.get(position).getImg());

		return item;
	}



}
