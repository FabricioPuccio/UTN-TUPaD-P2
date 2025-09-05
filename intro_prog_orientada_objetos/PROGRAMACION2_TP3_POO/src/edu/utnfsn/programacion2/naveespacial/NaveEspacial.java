package edu.utnfsn.programacion2.naveespacial;

/**
 *
 * @author Fabricio
 */
public class NaveEspacial {
    // Atributos
    private String nombre;
    private double combustible;
    private final double LIMITE_COMBUSTIBLE = 100.0; // Constante para validar límite

    // Constructor
    public NaveEspacial(String nombre, double combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    // Método para despegar
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " despegó. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar (validar combustible)
    public void avanzar(double distancia) {
        double combustibleNecesario = distancia * 0.5;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    // Método para recargar combustible (evitar superar límite utilizando constante para no repetir código)
    public void recargarCombustible(double cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado. Total: " + combustible);
        } else {
            System.out.println("No se puede recargar, superaría el límite de " + LIMITE_COMBUSTIBLE);
        }
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("\nNave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }
}
