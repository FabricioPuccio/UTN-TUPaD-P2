/*
10. Actualización de stock a partir de venta y recepción de productos.
Crea un método actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
 */
package com.practica.actualizarstock;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ActualizarStock {
    
    static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int stockActual, cantidadVendida, cantidadRecibida, nuevoStock;
        
        // Entrada de datos
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = sc.nextInt();

        // Cálculo usando el método
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Salida de resultados
        System.out.println("\nEl nuevo stock del producto es: " + nuevoStock);

        sc.close();
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
}
