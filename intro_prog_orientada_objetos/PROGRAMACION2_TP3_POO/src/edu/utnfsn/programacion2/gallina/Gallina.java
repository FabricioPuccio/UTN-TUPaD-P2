package edu.utnfsn.programacion2.gallina;

/**
 *
 * @author Fabricio
 */
public class Gallina {
    // Atributos
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    // Constructor
    // Atributo huevosPuesto inicialido en 0 
    public Gallina(String idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    // Método para poner huevos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("\nLa gallina con el id: "+ this.idGallina + 
                " puso un huevo. Total: " + huevosPuestos);
    }

    // Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("\nLa gallina con el id: "+ this.idGallina + 
                " cumplio un anio. Ahora tiene " + this.edad + " anios.");
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("\nGallina ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad + " anios");
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}
