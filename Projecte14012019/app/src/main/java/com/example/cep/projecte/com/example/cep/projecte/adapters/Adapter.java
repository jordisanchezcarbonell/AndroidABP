package com.example.cep.projecte.com.example.cep.projecte.adapters;

/* ============================================================================
* Aplicació: Classe Adapter
* Arxiu: Adapter.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los atributos del Adapter.
* ========================================================================= */
public class Adapter
{

	private int img;
	private String nombre;

	public Adapter(int img, String nombre)
	{
		this.img = img;
		this.nombre = nombre;
	}

	public int getImg()
	{
		return img;
	}

	public void setImg(int img)
	{
		this.img = img;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}


}

