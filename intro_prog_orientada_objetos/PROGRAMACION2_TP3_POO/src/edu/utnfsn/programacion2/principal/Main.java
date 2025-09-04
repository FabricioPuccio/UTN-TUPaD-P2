package edu.utnfsn.programacion2.principal;

import edu.utnfsn.programacion2.estudiante.Estudiante;

/**
 *
 * @author Fabricio
 */
public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Fabricio";
        estudiante.apellido = "Puccio";
        estudiante.curso = "Programación 2";
        estudiante.calificacion = 8.5;

        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.5);
        estudiante.bajarCalificacion(0.5);
    }

}
