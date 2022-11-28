package org.example;

import org.example.clases.Jugador;
import org.example.clases.Tecnico;

public class Main {
    public static void main(String[] args) {

        Jugador objetoJugador = new Jugador();
        Tecnico objetoTecnico = new Tecnico();

        objetoTecnico.saludar();
        objetoJugador.saludar();

    }
}