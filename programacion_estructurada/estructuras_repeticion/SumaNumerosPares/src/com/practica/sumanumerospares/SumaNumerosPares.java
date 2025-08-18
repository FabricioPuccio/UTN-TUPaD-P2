/*
 5. Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
 */
package com.practica.sumanumerospares;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class SumaNumerosPares {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int sum = 0, num;
        boolean ciclo = true;

        while (ciclo) {
            System.out.print("Digite un número entero o 0 para finalizar: ");
            num = sc.nextInt();

            if (num == 0) {
                ciclo = false;
            }

            if (num != 0 && num % 2 == 0) {
                sum += num;
            }
        }
        sc.close();
        System.out.println("La suma de los números pares es: " + sum);
    }

}
