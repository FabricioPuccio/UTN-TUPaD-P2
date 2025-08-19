/*
8. Cálculo del Precio Final con impuesto y descuento.
Crea un método calcularPrecioFinal(double impuesto, double
descuento) que calcule el precio final de un producto en un e-commerce. La
fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times
Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al método y muestra el precio
final.
 */
package com.practica.calculopreciofinal;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class CalculoPrecioFinal {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        double precioBase, impuesto, descuento, precioFinal;

        System.out.print("Ingrese el precio base del producto: ");
        precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        descuento = sc.nextDouble();

        precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.printf("El precio final del producto es: %.2f%n", precioFinal);

        sc.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double montoImpuesto, montoDescuento;
        montoImpuesto = (precioBase * impuesto) / 100;
        montoDescuento = (precioBase * descuento) / 100;
        return (precioBase + montoImpuesto) - montoDescuento;
    }

}
