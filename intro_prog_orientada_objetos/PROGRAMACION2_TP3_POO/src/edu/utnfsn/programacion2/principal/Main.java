package edu.utnfsn.programacion2.principal;

import edu.utnfsn.programacion2.gallina.Gallina;

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
//        Mascota mascota = new Mascota();
//        mascota.nombre = "Lyon";
//        mascota.especie = "Perro";
//        mascota.edad = 10;
//        mascota.mostrarInfo();
//        mascota.cumplirAnios();
        //3. Encapsulamiento con la Clase Libro
//        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
//        
//        libro1.mostrarInfo();
//        
//        System.out.println("\nIntento modificar año con valor inválido");
//        libro1.setAñoPublicacion(0);
//        
//        System.out.println("\nIntento modificar año con un valor válido");
//        libro1.setAñoPublicacion(2024);
//        
//        libro1.mostrarInfo();
        // Utilizamos método constructor
        
        
        // Recibe por parámetro ID y edad
        Gallina g1 = new Gallina("G001", 1);
        Gallina g2 = new Gallina("G002", 2);

        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();
    }
}
