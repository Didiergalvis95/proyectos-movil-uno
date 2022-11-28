package org.example.clases;

public class Directivo extends Persona {
    private String pais;


    public Directivo() {
    }

    public Directivo(String id, String nombre, String apellido, Integer edad, String pais) {
        super(id, nombre, apellido, edad);
        this.pais = pais;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
