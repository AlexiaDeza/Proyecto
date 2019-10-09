package com.example.demo.entidades;

import java.util.ArrayList;

public class Disparos {

    private ArrayList<String> tiro;
    private int turno;

    public Disparos(ArrayList<String> tirox,int turn){
        tiro=tirox;
        turno=turn;
    }

    public ArrayList<String> getTiro() {
        return tiro;
    }

    public int getTurno() {
        return turno;
    }

    public void setTiro(ArrayList<String> tiro) {
        this.tiro = tiro;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
