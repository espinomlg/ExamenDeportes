package com.example.espino.deportesfavoritos;

import android.app.Application;
import android.content.Context;

import com.example.espino.deportesfavoritos.modelos.Deporte;

import java.util.ArrayList;
import java.util.List;


public class DeportesFavoritosApplication extends Application {

    private ArrayList<Deporte> lista;


    public List<Deporte> getList(){
        return  lista;
    }

    public DeportesFavoritosApplication(){
        super();

        lista = new ArrayList<>();

        lista.add(new Deporte(R.drawable.icon_basketball, "Baloncesto", false));
        lista.add(new Deporte(R.drawable.icon_gaelic_football, "Fútbol", false));
        lista.add(new Deporte(R.drawable.icon_motorbike, "Motociclismo", false));
        lista.add(new Deporte(R.drawable.icon_volleyball, "Volleyball", false));
        lista.add(new Deporte(R.drawable.icon_golf, "Golf", false));
        lista.add(new Deporte(R.drawable.icon_trotting, "Equitación", false));
        lista.add(new Deporte(R.drawable.icon_handball, "Balonmano", false));
        lista.add(new Deporte(R.drawable.icon_chess, "Ajedréz", false));
        lista.add(new Deporte(R.drawable.icon_boxing, "Boxeo", false));
    }
}
/*
        lista.add(new Deporte(R.drawable.icon_basketball, getResources().getString(R.string.baloncesto), false));
        lista.add(new Deporte(R.drawable.icon_gaelic_football, getResources().getString(R.string.futbol), false));
        lista.add(new Deporte(R.drawable.icon_motorbike, getResources().getString(R.string.motociclismo), false));
        lista.add(new Deporte(R.drawable.icon_volleyball, getResources().getString(R.string.volleyball), false));
        lista.add(new Deporte(R.drawable.icon_golf, getResources().getString(R.string.golf), false));
        lista.add(new Deporte(R.drawable.icon_trotting, getResources().getString(R.string.equitacion), false));
        lista.add(new Deporte(R.drawable.icon_handball, getResources().getString(R.string.balonmano), false));
        lista.add(new Deporte(R.drawable.icon_chess, getResources().getString(R.string.ajedrez), false));
        lista.add(new Deporte(R.drawable.icon_boxing, getResources().getString(R.string.boxeo), false));
        lista.add(new Deporte(R.drawable.icon_cricket, getResources().getString(R.string.criquet), false));
        lista.add(new Deporte(R.drawable.icon_icehockey, getResources().getString(R.string.hockey), false));
        lista.add(new Deporte(R.drawable.icon_tennis, getResources().getString(R.string.tennis), false));
        lista.add(new Deporte(R.drawable.icon_american_football, getResources().getString(R.string.futbol_americano), false));
        lista.add(new Deporte(R.drawable.icon_darts, getResources().getString(R.string.dardos), false));
        lista.add(new Deporte(R.drawable.icon_table_tennis, getResources().getString(R.string.pingpong), false));
        */