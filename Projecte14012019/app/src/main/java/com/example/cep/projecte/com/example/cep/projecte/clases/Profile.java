package com.example.cep.projecte.com.example.cep.projecte.clases;
/* ============================================================================
* Aplicació: Classe Profile
* Arxiu: Profile.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos especificos de la clase Profile
* ========================================================================= */
public class Profile
{

	private String nombre;


	public Profile(String nombre)
	{
		this.nombre = nombre;
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
