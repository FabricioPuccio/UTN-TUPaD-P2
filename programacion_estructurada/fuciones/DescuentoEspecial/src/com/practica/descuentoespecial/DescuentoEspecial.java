/*
11. Cálculo de descuento especial usando variable global.
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
método calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del método, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
 */
package com.practica.descuentoespecial;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class DescuentoEspecial {
    
    // Constante global (final)
    static final double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double precio, precioFinal;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = sc.nextDouble();

        System.out.println("El descuento especial aplicado es: " + calcularDescuentoEspecial(precio));

        precioFinal = precio - calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + precioFinal);

        sc.close();
    }

    public static double calcularDescuentoEspecial(double precio) {
        // Variable local
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;

        return descuentoAplicado;

    }

}
