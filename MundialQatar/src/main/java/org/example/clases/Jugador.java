package org.example.clases;

public class Jugador extends Persona {
    private String posicion;
    private Integer numeroCamiseta;


    public Jugador() {
    }

    public Jugador(String id, String nombre, String apellido, Integer edad, String posicion, Integer numeroCamiseta) {
        super(id, nombre, apellido, edad);
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(Integer numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
