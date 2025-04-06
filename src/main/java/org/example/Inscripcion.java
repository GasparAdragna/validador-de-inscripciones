package org.example;

import java.util.List;

public class Inscripcion {
    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public Boolean aprobada() {
        List<Materia> correlativas = this.materias.stream().flatMap(m -> m.getCorrelativas().stream()).toList();
        return this.alumno.getMaterias().containsAll(correlativas);

    }
}
