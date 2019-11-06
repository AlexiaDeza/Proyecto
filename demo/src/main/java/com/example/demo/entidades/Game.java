package com.example.demo.entidades;
import com.example.demo.Jugadores.Jugador;

import java.util.HashSet;

public class Game {
    private  Jugador jugador1;
    private  Jugador jugador2;
    private int id;

    public Game(Jugador jugadoor1,Jugador jugadoor2,int idx){
        jugador1=jugadoor1;
        jugador2=jugadoor2;
        id=idx;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public boolean TerminaJuego(){
        if(jugador1.EsGanador()==true || jugador2.EsGanador()==true ){
            return true;
        }
        else{
            return false;
        }
    }
}
