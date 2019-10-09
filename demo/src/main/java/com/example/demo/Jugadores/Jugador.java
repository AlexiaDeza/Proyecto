package com.example.demo.Jugadores;
import com.example.demo.entidades.Barco;
import com.example.demo.entidades.Disparos;
import com.example.demo.entidades.Game;

import java.util.ArrayList;
import java.util.HashSet;

public class Jugador{
    private String nombre;
    private HashSet<Barco> Barcos;
    private ArrayList<Disparos> dispaross;
    private int aciertos;
    private Game gamee;

    public Jugador(HashSet<Barco> barquitos, String nombrex, ArrayList<Disparos> disp,int aciertosx, Game gameex){
        Barcos=barquitos;
        nombre=nombrex;
        dispaross=disp;
        aciertos=aciertosx;
        gamee=gameex;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Barco> getBarcos() {
        return Barcos;
    }

    public ArrayList<Disparos> getDispaross() {
        return dispaross;
    }

    public Game getGamee() {
        return gamee;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarcos(HashSet<Barco> barcos) {
        Barcos = barcos;
    }

    public void setGamee(Game gamee) {
        this.gamee = gamee;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setDispaross(ArrayList<Disparos> dispaross) {
        this.dispaross = dispaross;
    }
    public Jugador jugadorContrario(){
        if(gamee.getJugador1().getNombre() !=nombre){
            return gamee.getJugador1();
        }
        else{
            return gamee.getJugador2();
        }
    }

    public ArrayList<String> posicionesContrarias(){
        ArrayList<String> p= new ArrayList<String>();
        for (Barco b : jugadorContrario().getBarcos()){
            p.addAll(b.getPosiciones());
        }
        return p;
    }
    public ArrayList<String> disparitos(){
        ArrayList<String> d=new ArrayList<>();
        for(int i=0;i<dispaross.size();i++){
            d.addAll(dispaross.get(i).getTiro());
        }
        return d;
    }

    public boolean EsGanador(){
        for(int i=0;i< dispaross.size();i++)
        for(int j=0;j<posicionesContrarias().size();j++){
            if(disparitos().get(i)==posicionesContrarias().get(j)){
            aciertos=aciertos+1;
            }
        }
        if(aciertos==21){
            return true;
        }
        else{
            return false;
        }
    }





}
