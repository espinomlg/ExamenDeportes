package com.example.espino.deportesfavoritos.modelos;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by espino on 23/11/16.
 */

public class PreferenciasAplicacion {

    public static final String PREFERENCIAS = "deportes_favoritos";

    private static PreferenciasAplicacion mispreferencias;
    private SharedPreferences preferencias;
    private Context context;

    private PreferenciasAplicacion(Context context){
        this.context = context;
        preferencias = context.getSharedPreferences(PREFERENCIAS, Context.MODE_PRIVATE);
    }
    public static PreferenciasAplicacion getInstance(Context context){
        if(mispreferencias == null)
            mispreferencias = new PreferenciasAplicacion(context);

        return mispreferencias;
    }

    private SharedPreferences.Editor getEditor(){
        return preferencias.edit();
    }

    public void putBoolean(String nombreDeporte, boolean checked){
        getEditor().putBoolean(nombreDeporte, checked);
    }

    public boolean getBoolean(String nombreDeporte){
        return preferencias.getBoolean(nombreDeporte, false);
    }

}
