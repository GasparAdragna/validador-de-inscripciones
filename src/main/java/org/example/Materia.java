package org.example;

import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public Materia(String nombre, List<Materia> correlativas) {
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Materia> getCorrelativas() {
        return this.correlativas;
    }
}
