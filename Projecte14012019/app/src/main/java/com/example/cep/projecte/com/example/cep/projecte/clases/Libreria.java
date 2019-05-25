package com.example.cep.projecte.com.example.cep.projecte.clases;


import java.io.Serializable;
import java.util.ArrayList;
/* ============================================================================
* Aplicació: Classe Libreria
* Arxiu: Libreria.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos especificos de la clase Libreria
* ========================================================================= */
public class Libreria implements Serializable
{

    public String nombre;
    public String Direccion;
    public String Contacto;
    public int foto;


    public Libreria(String nombre)
    {
        this.nombre = nombre;
    }

    public Libreria(String nombre, String direccion, String contacto, int foto)
    {
        this.nombre = nombre;
        Direccion = direccion;
        Contacto = contacto;
        this.foto = foto;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return Direccion;
    }

    public String getContacto()
    {
        return Contacto;
    }

    public int getFoto()
    {
        return foto;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion)
    {
        Direccion = direccion;
    }

    public void setContacto(String contacto)
    {
        Contacto = contacto;
    }

    public void setFoto(int foto)
    {
        this.foto = foto;
    }


}