package org.example;

import org.example.clases.Avanzado;
import org.example.clases.Junior;

public class Main {
    public static void main(String[] args) {
        Junior junior = new Junior();
        Avanzado avanzado = new Avanzado();

        junior.programar();
        avanzado.programar();

    }
}