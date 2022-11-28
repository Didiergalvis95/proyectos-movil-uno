package org.example.clases;

import org.example.interfaces.Acciones;

public class Avanzado extends Programador implements Acciones {

    @Override
    public void programar() {
        System.out.println("soy un avanzado y estoy programando");
    }

    @Override
    public void renunciar() {

    }

    public Avanzado() {
    }
}
