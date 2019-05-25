package com.example.cep.projecte.com.example.cep.projecte.com.example.cep.projecte.managers;

import com.example.cep.projecte.R;
import com.example.cep.projecte.com.example.cep.projecte.clases.Actividad;
import com.example.cep.projecte.com.example.cep.projecte.clases.ExtendedActividad;
import com.example.cep.projecte.com.example.cep.projecte.clases.Libreria;

import java.util.ArrayList;

/* ============================================================================
* Aplicació: Classe ActividadesManager
* Arxiu: ActividadesManager.java
* Data de creació: 18/10/2018
* Descripcion: Contiene los Arraylist de las actividades y su ExtendedActivity, con los valores que queremos mostrar.
* ========================================================================= */
public class ActividadesManager
{
    

 
    
    
/* ----------------------------------------------------------------------------
* Funció: getActividades()
* Paràmetres: Ninguno
* Descripció: Aqui es donde añadiremos las actividades , con sus nombre,imagen,descripcion especifica.

* ------------------------------------------------------------------------- */
    public static ArrayList<Actividad> getActividades()
    {
        ArrayList<Actividad> actividades = new ArrayList<>();

        Libreria lib = new Libreria("Casa del libro");
        Libreria lib2 = new Libreria("Abacus");

        actividades.add(new Actividad("Cuentacuentos", R.drawable.logocuentacuentos, "Una casa de contes. A les cases viuen famílies i de cadascun dels seus integrants traurem contes que compartir. L'ocell mort. Una casa de contes. A les cases viuen famílies i de cadascun dels seus integrants traurem contes que compartir. A més farem un ritual. Amb Sonia.", lib ));

        actividades.add(new Actividad("Taller", R.drawable.logotallerescritura, "Taller de creación y autocorrección literaria", lib2 ));

        actividades.add(new Actividad("Presentació", R.drawable.logopresentacionlibro, "Manuel del Barri presenta el seu nou llibre No sóc el primer ni l'últim que salta des d'un setè pis", lib2 ));

        actividades.add(new Actividad("Signatura de llibre", R.drawable.logofirmadelibro, "L'autor estarà avui en la llibreria i estarà en un estan para si vols que us signi el vostre exemplar", lib2 ));

        actividades.add(new Actividad("Donació de llibres", R.drawable.logodonatuslibros, "Pots donar els llibre que vulguis en les següents llibreries", lib2 ));
        actividades.add(new Actividad("Diumenge de cómics", R.drawable.logocomics, "Dia especial de còmics , avui en la llibreria hi haurà descomptes en els còmics i si compreu un us porteu una recompensa", lib2 ));
        actividades.add(new Actividad("Taller d'escriptura", R.drawable.logotallerescritura, "El taller d'escriptura creativa Fuentetaja proporciona les eines necessàries per trobar un camí propi a l'hora d'emprendre l'apassionant viatge de creació literària. Aquest taller d'escriptura ofereix cursos anuals de novel·la, poesia, narrativa per a joves o microrelat.", lib2 ));
        actividades.add(new Actividad("Club de lectura", R.drawable.logoclublectura, "Avui en la nostra llibreria us donarem l'oportunitat per poder llegir qualsevol llibre i es llegirà un llibre que es comentarà al llarg del dia", lib2 ));
        actividades.add(new Actividad("Curs d'escriptura: Escriptura Creativa", R.drawable.logoclubescritura, "El taller d'Escriptura Creativa es presenta amb tres programes diferents, de tres mesos cadascun: L'escriptura deslligada, Escrivim sense parar i Desbloqueja la teva escriptura. Poden cursar-se en qualsevol ordre. El preu indicat en les opcions de pagament és per a cada programa de tres mesos.", lib2 ));
        actividades.add(new Actividad("Sortida de llibre", R.drawable.logocompralibros, "Si compra aquest llibre en la nostra llibreria , tindràs una major recompensa.", lib2 ));



        return actividades;
    }
    
    
    
        
    
    /* ----------------------------------------------------------------------------
* Funció: getActividades(Actividad actividad)
* Paràmetres: Actividad actividad
* Descripció: Pasamos por referencia una actividad y dependera de su nombre añadira mas informacion especifica

* ------------------------------------------------------------------------- */
    
    public static ExtendedActividad getActividad(Actividad actividad)
    {
        String horario = null;
        String fecha = null;
        String recompensaEXP = null;
        String recompensaPTS = null;
        String email = null;
        String ubicacion = null;
        String contacto = null;

        switch(actividad.getNombre())
        {
            case "Cuentacuentos":
                horario = "18:30";
                fecha = "16/01/2019";
                recompensaEXP = "Exp 50pts";
                recompensaPTS = "Recompensa -10%";
                email = "admin@cuentacuentos.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Taller":
                horario = "9:00";
                fecha = "26/01/2019";
                recompensaEXP = "Exp 40pts";;
                recompensaPTS = "Recompensa -20%";
                email = "tcreacion@admin.com";
                ubicacion = "Carrer de Mallorca, 237, 08008 Barcelona";
                contacto = "902026408";
                break;
            case "Presentació":
                horario = "19:00";
                fecha = "20/03/2019";
                recompensaEXP = "Exp 50pts";
                recompensaPTS ="Recompensa Alquiler gratis!";
                email = "admin@casadellibro.com";
                ubicacion = "Carrer de Balmes, 163, 08008 Barcelona";
                contacto = "902026407";
                break;
            case "Donació de llibre":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP = "Exp 50pts";
                recompensaPTS = "Recompensa -10%";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Diumenge de cómics":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP ="Exp 50pts";
                recompensaPTS = "Recompensa x2pts experiencia";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Taller d'escriptura":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP ="Exp 50pts";
                recompensaPTS = "Recompensa -10% en todas las librerias!";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Club de lectura":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP = "Exp 50pts";
                recompensaPTS = "Recompensa entradas cine";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Signatura de llibre":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP = "Exp 50pts";
                recompensaPTS = "Recompensa -10%";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Curs d'escriptura: Escriptura Creativa":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP ="Exp 50pts";
                recompensaPTS = "Recompensa -10%";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
            case "Sortida de llibre":
                horario = "16:00";
                fecha = "06/05/2018";
                recompensaEXP = "Exp 50pts";
                recompensaPTS = "Recompensa -10%";
                email = "admin@admin.com";
                ubicacion = "Passeig de Gràcia, 62, 08007 Barcelona";
                contacto = "902026407";
                break;
        }

//Crearemos el nuevo ExtenderActividad con los datos especificos
        ExtendedActividad extActividad = new ExtendedActividad(actividad.Nombre, actividad.foto, actividad.Descripcion, actividad.Libreria, horario, fecha, recompensaEXP, recompensaPTS, email, ubicacion, contacto);

        return extActividad;
    }
}
