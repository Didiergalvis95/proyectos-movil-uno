package org.example.clases;

public class Tecnico extends Persona {
    private Double salario;


    public Tecnico() {
    }

    public Tecnico(String id, String nombre, String apellido, Integer edad, Double salario) {
        super(id, nombre, apellido, edad);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
