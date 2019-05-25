package com.example.cep.projecte.com.example.cep.projecte.clases;



import java.io.Serializable;

/* ============================================================================
* Aplicació: Classe Actividad
* Arxiu: Actividad.java

* Data de creació: 18/10/2018
* Descripció: Contiene los atributos especificos de la clase Actividad
* ========================================================================= */
public class Actividad implements Serializable
{
    public String Nombre;
    public int foto;
    public String Descripcion;
    public com.example.cep.projecte.com.example.cep.projecte.clases.Libreria Libreria;
    public  String images;
    public Actividad(String Nombre){
        this.Nombre = Nombre;
    }

    public Actividad(String nombre, int foto, String descripcion, Libreria libreria)
    {
        Nombre = nombre;
        this.foto = foto;
        Descripcion = descripcion;
        this.Libreria = libreria;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public int getFoto()
    {
        return foto;
    }

    public String getDescripcion()
    {
        return Descripcion;
    }

    public com.example.cep.projecte.com.example.cep.projecte.clases.Libreria getLibreria()
    {
        return Libreria;
    }

    public void setNombre(String nombre)
    {
        Nombre = nombre;
    }

    public void setFoto(int foto)
    {
        this.foto = foto;
    }

    public void setDescripcion(String descripcion)
    {
        Descripcion = descripcion;
    }

    public void setLibreria(com.example.cep.projecte.com.example.cep.projecte.clases.Libreria libreria)
    {
        Libreria = libreria;
    }


}