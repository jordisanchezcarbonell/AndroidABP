package com.example.cep.projecte.com.example.cep.projecte.clases;

import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

public class ExtendedLibreria extends Libreria
{

/* ============================================================================
* Aplicació: Classe ExtendedLibreria
* Arxiu: ExtendedLibreria.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ExtendedLibreria donde extends sobre la clase Libreria
* ========================================================================= */
	public String descripcion;
	public String horariolib;
	public String horarioesp;
	public String paginaweb;
	public String redessociales;
	public Actividad Actividades;

	public ExtendedLibreria(String nombre, String direccion, String contacto, int foto, String descripcion, String horariolib, String horarioesp, String paginaweb, String redessociales, Actividad actividades)
	{
		super(nombre, direccion, contacto, foto);
		this.descripcion = descripcion;
		this.horariolib = horariolib;
		this.horarioesp = horarioesp;
		this.paginaweb = paginaweb;
		this.redessociales = redessociales;
		Actividades = actividades;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public String getHorariolib()
	{
		return horariolib;
	}

	public String getHorarioesp()
	{
		return horarioesp;
	}

	public String getPaginaweb()
	{
		return paginaweb;
	}

	public String getRedessociales()
	{
		return redessociales;
	}

	public Actividad getActividades()
	{
		return Actividades;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public void setHorariolib(String horariolib)
	{
		this.horariolib = horariolib;
	}

	public void setHorarioesp(String horarioesp)
	{
		this.horarioesp = horarioesp;
	}

	public void setPaginaweb(String paginaweb)
	{
		this.paginaweb = paginaweb;
	}

	public void setRedessociales(String redessociales)
	{
		this.redessociales = redessociales;
	}

	public void setActividades(Actividad actividades)
	{
		Actividades = actividades;
	}
}

