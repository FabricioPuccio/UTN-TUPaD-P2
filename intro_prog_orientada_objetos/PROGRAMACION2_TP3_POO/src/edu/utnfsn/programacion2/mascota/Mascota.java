package edu.utnfsn.programacion2.mascota;

/**
 *
 * @author Fabricio
 */
public class Mascota {
    
    // Atributos
    public String nombre;
    public String especie;
    public int edad;
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Método para cumplir años
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años. Ahora tiene " + edad + " años.");
    }
    
}
