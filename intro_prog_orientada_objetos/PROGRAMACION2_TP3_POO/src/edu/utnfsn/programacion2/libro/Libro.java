package edu.utnfsn.programacion2.libro;

/**
 *
 * @author Fabricio
 */
public class Libro {
    
    // Atributos privados
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Método Constructor, recibe parámetros para inicializar atributos
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion); // Usamos setter para validación
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación para año de publicación
    public void setAñoPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido.");
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
    
}
