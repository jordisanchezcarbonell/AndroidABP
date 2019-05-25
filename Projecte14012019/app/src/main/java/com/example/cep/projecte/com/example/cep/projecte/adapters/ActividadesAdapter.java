package com.example.cep.projecte.com.example.cep.projecte.adapters;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;

import java.util.ArrayList;
/* ============================================================================
* Aplicacion: Classe ActividadesAdapter
* Arxiu: ActividadesActivity.java

* Data de creacion: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ver la listview
            de las actividades.
* ========================================================================= */
public class ActividadesAdapter extends ArrayAdapter<Actividad>
{
    private Context context;
    private ArrayList<Actividad> listaActividades;

    public ActividadesAdapter(Context context, ArrayList<Actividad> list)
    {
        super(context, 0, list);
        this.context = context;
        listaActividades = list;
    }
/* ----------------------------------------------------------------------------
* Funcion: View getView (int position, View convertView, ViewGroup parent)
* Parametres: int position, View convertView, ViewGroup parent
* Descripcion: Indicamos los valores que se van a seleccionar para ver en la listview

* ------------------------------------------------------------------------- */
    public View getView (int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.actividad_item,parent,false);

        Actividad currentActividad = listaActividades.get(position);

		//Enlazamos nuestro ImageView con el dise�o.
        ImageView image = (ImageView)listItem.findViewById(R.id.ImgActividad);
        image.setImageResource(currentActividad.getFoto());
//Enlazamos nuestro TextView con el dise�o 
        TextView nombre = (TextView) listItem.findViewById(R.id.TxtTituloAct);
        nombre.setText(currentActividad.getNombre());

//Enlazamos nuestro TextView con el dise�o 
        TextView descripcion = (TextView) listItem.findViewById(R.id.TxtDescActividad);
        descripcion.setText(currentActividad.getDescripcion());

        return listItem;
    }
}