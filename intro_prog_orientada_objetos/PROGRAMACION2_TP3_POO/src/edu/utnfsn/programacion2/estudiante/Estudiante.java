package edu.utnfsn.programacion2.estudiante;

/**
 *
 * @author Fabricio
 */
public class Estudiante {
    
    /*Decidí estructurar y organizar el proyecto en diferentes paquetes, quizás
      es un concepto mas avanzado que no logro manejar del todo por eso tube que
      poner utilizar public para los modificadores de acceso en los atributos.
    */
    // Atributos
    public String nombre;
    public String apellido;
    public String curso;
    public double calificacion;
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    // Método para subir calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada a: " + calificacion);
    }

    // Método para bajar calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificación reducida a: " + calificacion);
    }
    
}
