/*
9. Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar
 */
package com.practica.composicionfunciones;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ComposicionFunciones {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.next();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("\nCosto de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

        sc.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {

        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona no válida. Se tomará costo de envío 0.");
            return 0;
        }

    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

}
