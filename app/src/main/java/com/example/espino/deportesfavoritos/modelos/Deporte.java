package com.example.espino.deportesfavoritos.modelos;

/**
 * Created by espino on 23/11/16.
 */

public class Deporte {

    private int image;
    private String nombre;
    private boolean checked;

    public Deporte(int image, String nombre, boolean checked) {
        this.image = image;
        this.nombre = nombre;
        this.checked = checked;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
