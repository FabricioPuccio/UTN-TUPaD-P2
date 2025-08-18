/*
2. Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
 */
package com.practico.mayordetresnumeros;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class MayorDeTresNumeros {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numUno, numDos, numTres;
        System.out.print("Este programa determina el número mas grande entre tres enteros!\n"
                + "Ingrese el primer número entero: ");
        numUno = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el segundo número entero: ");
        numDos = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el tercer número entero: ");
        numTres = Integer.parseInt(sc.nextLine());
        
        if (numUno >= numDos && numUno >= numTres) {
            System.out.println("El mayor número entero ingresado es: " + numUno);
        } else if (numDos >= numTres) {
            System.out.println("El mayor número entero ingresado es: " + numDos);
        } else {
            System.out.println("El mayor número entero ingresado es: " + numTres);
        }
    }

}
