package com.example.cep.projecte.com.example.cep.projecte.clases;

import android.annotation.SuppressLint;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import java.lang.reflect.Field;
        /* ============================================================================
* Aplicació: Classe BottomNavigationViewHelper
* Arxiu: BottomNavigationViewHelper.java
* Data de creació: 18/10/2018
* Descripcion: Muestra el nombre del elemento de la barra inferior es decir que se muetro icono mas letra en todo los elementos.
* ========================================================================= */



public class BottomNavigationViewHelper
{
    
/* ----------------------------------------------------------------------------
* Funció: disableShiftMode
* Paràmetres: BottomNavigationView view
* Descripció: Muestra el nombre del elemento de la barra inferior es decir que se muetro icono mas letra en todo los elementos.Para no ocultar el nombre cuando se haga click

* ------------------------------------------------------------------------- */
    @SuppressLint("RestrictedApi")
    public static void disableShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {

                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            Log.e("BNVHelper", "Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e);
        }
    }
}
