package com.example.demo.entidades;

import java.util.ArrayList;

public abstract class Barco {
    private ArrayList<String> Posiciones;
    private String nombre;

    public Barco(ArrayList<String> posicion, String nombrex){
    Posiciones=posicion;
    nombre=nombrex;
    }

    public ArrayList<String> getPosiciones() {
        return Posiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPosiciones(ArrayList<String> posiciones) {
        Posiciones = posiciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
