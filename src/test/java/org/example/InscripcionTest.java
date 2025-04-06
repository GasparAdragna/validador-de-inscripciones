package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    Materia sypn = new Materia("Sistemas y Procesos de Negocio", new ArrayList<Materia>());
    Materia ayed = new Materia("Algoritmos y Estructuras de Datos", new ArrayList<Materia>());
    Materia lyed = new Materia("Lógica y Estructuras Discretas", new ArrayList<Materia>());

    Materia asi = new Materia("Análisis de Sistemas de Información", Arrays.asList(sypn, ayed));
    Materia pdp = new Materia("Paradigmas de Programación", Arrays.asList(lyed, ayed));

    Materia dsi = new Materia ("Diseño de Sistemas de Información", Arrays.asList(asi, pdp));

    @Test
    @DisplayName("Test de inscripción aprobada")
    public void testAprobada() {

        List<Materia> materiasAprobadas = Arrays.asList(sypn, ayed, lyed, asi, pdp);

        Alumno gaspar = new Alumno("Gaspar", "Adragna", 1, materiasAprobadas);

        Inscripcion inscripcion = new Inscripcion(gaspar, Arrays.asList(dsi));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test de inscripción desaprobada")
    public void testDesaprobada() {

        List<Materia> materiasAprobadas = Arrays.asList(sypn, ayed, lyed, asi);

        Alumno gaspar = new Alumno("Gaspar", "Adragna", 1, materiasAprobadas);

        Inscripcion inscripcion = new Inscripcion(gaspar, Arrays.asList(dsi));

        Assertions.assertFalse(inscripcion.aprobada());
    }

}