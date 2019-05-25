package com.example.cep.projecte.com.example.cep.projecte.adapters;

import android.content.Context;
		import android.view.LayoutInflater;
		import android.view.View;
		import android.view.ViewGroup;
		import android.widget.ArrayAdapter;
		import android.widget.ImageView;
		import android.widget.TextView;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

import java.util.ArrayList;

/* ============================================================================
* Aplicació: Classe LibreriasAdapter
* Arxiu: LibreriasAdapter.java

* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ver la listview
            de las actividades.
* ========================================================================= */
public class LibreriasAdapter extends ArrayAdapter<Libreria>
{
	private Context context;
	private ArrayList<Libreria> listaLibrerias;

	public LibreriasAdapter(Context context, ArrayList<Libreria> list)
	{
		super(context, 0, list);
		this.context = context;
		listaLibrerias = list;
	}

/* ----------------------------------------------------------------------------
* Funció: View getView (int position, View convertView, ViewGroup parent)
* Paràmetres: int position, View convertView, ViewGroup parent
* Descripció: Indicamos los valores que se van a seleccionar para ver en la listview

* ------------------------------------------------------------------------- */
	public View getView (int position, View convertView, ViewGroup parent){
		View listItem = convertView;
		if(listItem == null)
			listItem = LayoutInflater.from(context).inflate(R.layout.libreria_item,parent,false);

		Libreria currentLibreria = listaLibrerias.get(position);

		ImageView image = (ImageView)listItem.findViewById(R.id.ImgLibreria);
		image.setImageResource(currentLibreria.getFoto());

		TextView nombre = (TextView) listItem.findViewById(R.id.TxtNombreLib);
		nombre.setText(currentLibreria.getNombre());

		TextView libreria = (TextView) listItem.findViewById(R.id.TxtDireccionLib);
		libreria.setText(currentLibreria.getDireccion());

		TextView descripcion = (TextView) listItem.findViewById(R.id.TxtContactoLib);
		descripcion.setText(currentLibreria.getContacto());

		return listItem;
	}
}