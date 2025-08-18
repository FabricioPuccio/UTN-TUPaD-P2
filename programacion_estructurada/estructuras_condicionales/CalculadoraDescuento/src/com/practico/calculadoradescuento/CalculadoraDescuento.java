/*
4. Calculadora de Descuento según categoría.
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
 */
package com.practico.calculadoradescuento;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class CalculadoraDescuento {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        float precio, precioFinal = 0f;
        String categoria;
        System.out.print("Sr. usuario, para calcular el descuento, por favor ingrese el precio del producto: ");
        precio = sc.nextFloat();

        System.out.print("Ingrese la categoría del producto (A, B ó C): ");
        categoria = sc.next().toUpperCase();

        switch (categoria) {
            case "A":
                precioFinal = precio - (precio * 10) / 100;
                break;
            case "B":
                precioFinal = precio - (precio * 15) / 100;
                break;
            case "C":
                precioFinal = precio - (precio * 20) / 100;
                break;
            default:
                System.out.println("Error! La categoría ingresada es invalida.");
        }

        sc.close();

        switch (categoria) {
            case "A" ->
                System.out.println("Descuento aplicado: 10%\nPrecio final: $" + precioFinal);
            case "B" ->
                System.out.println("Descuento aplicado: 15%\nPrecio final: $" + precioFinal);
            case "C" ->
                System.out.println("Descuento aplicado: 20%\nPrecio final: $" + precioFinal);
        }

    }

}
