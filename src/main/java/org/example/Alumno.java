package org.example;

import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private List<Materia> materias;

    public Alumno(String nombre, String apellido, Integer legajo, List<Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return this.materias;
    }
}
