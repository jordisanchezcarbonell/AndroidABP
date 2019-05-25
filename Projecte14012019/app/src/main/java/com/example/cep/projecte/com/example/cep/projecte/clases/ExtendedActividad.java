package com.example.cep.projecte.com.example.cep.projecte.clases;


import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;

/* ============================================================================
* Aplicació: Classe ExtendedActividad
* Arxiu: ExtendedActividad.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los metodos y atributos  especificos para ExtendedActivdad donde extends sobre la clase Actividad
* ========================================================================= */
public class ExtendedActividad extends Actividad
{
	public String horario;
	public String fecha;
	public String recompensaEXP;
	public String recompensaPTS;
	public String email;
	public String ubicacion;
	public String contacto;

	public ExtendedActividad(String nombre, int foto, String descripcion, com.example.cep.projecte.com.example.cep.projecte.clases.Libreria libreria, String horario, String fecha, String recompensaEXP, String recompensaPTS, String email, String ubicacion, String contacto)
	{
		super(nombre, foto, descripcion, libreria);
		this.horario = horario;
		this.fecha = fecha;
		this.recompensaEXP = recompensaEXP;
		this.recompensaPTS = recompensaPTS;
		this.email = email;
		this.ubicacion = ubicacion;
		this.contacto = contacto;
	}

	public String getHorario()
	{
		return horario;
	}

	public String getFecha()
	{
		return fecha;
	}



	public String getEmail()
	{
		return email;
	}

	public String getUbicacion()
	{
		return ubicacion;
	}

	public String getContacto()
	{
		return contacto;
	}

	public void setHorario(String horario)
	{
		this.horario = horario;
	}

	public void setFecha(String fecha)
	{
		this.fecha = fecha;
	}

	public String getRecompensaEXP() {
		return recompensaEXP;
	}

	public void setRecompensaEXP(String recompensaEXP) {
		this.recompensaEXP = recompensaEXP;
	}

	public String getRecompensaPTS() {
		return recompensaPTS;
	}

	public void setRecompensaPTS(String recompensaPTS) {
		this.recompensaPTS = recompensaPTS;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setUbicacion(String ubicacion)
	{
		this.ubicacion = ubicacion;
	}

	public void setContacto(String contacto)
	{
		this.contacto = contacto;
	}
}

