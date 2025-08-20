/*
12. Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
 */
package com.practica.ejerciciodocearrayprecios;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Fabricio
 */
public class EjercicioDoceArrayPrecios {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.printf("Precio: $%.2f%n", p);
        }

        int pos = ThreadLocalRandom.current().nextInt(precios.length);
        double nuevoPrecio = ThreadLocalRandom.current().nextDouble(50.0, 500.0);
        nuevoPrecio = Math.round(nuevoPrecio * 100.0) / 100.0;

        System.out.println("\nModificando el precio del producto en posición " + pos
                + " de $" + precios[pos] + " a $" + nuevoPrecio);

        precios[pos] = nuevoPrecio;

        System.out.println("\nPrecios modificados:");
        for (double p : precios) {
            System.out.printf("Precio: $%.2f%n", p);
        }
    }

}
