package edu.utnfsn.programacion2.principal;

import edu.utnfsn.programacion2.estudiante.Estudiante;
import edu.utnfsn.programacion2.mascota.Mascota;

/**
 *
 * @author Fabricio
 */
public class Main {

    public static void main(String[] args) {
        
        // Instancias y pruebas de todos los ejercicios y clases
        // 1. Registro de Estudiantes
//        Estudiante estudiante = new Estudiante();
//
//        estudiante.nombre = "Fabricio";
//        estudiante.apellido = "Puccio";
//        estudiante.curso = "Programación 2";
//        estudiante.calificacion = 8.5;
//
//        estudiante.mostrarInfo();
//        estudiante.subirCalificacion(1.5);
//        estudiante.bajarCalificacion(0.5);
        
        //2. Registro de Mascotas
        Mascota mascota = new Mascota();
        mascota.nombre = "Lyon";
        mascota.especie = "Perro";
        mascota.edad = 10;
        mascota.mostrarInfo();
        mascota.cumplirAnios();
    }

}
