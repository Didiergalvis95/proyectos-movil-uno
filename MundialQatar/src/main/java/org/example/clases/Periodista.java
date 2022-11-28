package org.example.clases;

public class Periodista extends Persona {
    private String medioTrabajo;


    public Periodista() {
    }

    public Periodista(String id, String nombre, String apellido, Integer edad, String medioTrabajo) {
        super(id, nombre, apellido, edad);
        this.medioTrabajo = medioTrabajo;
    }


    public String getMedioTrabajo() {
        return medioTrabajo;
    }

    public void setMedioTrabajo(String medioTrabajo) {
        this.medioTrabajo = medioTrabajo;
    }

}
