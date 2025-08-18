/*
6. Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
 */
package com.practica.contadorpositivosnegativosceros;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ContadorPositivosNegativosCeros {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int numEnt;
        int pos = 0, neg = 0, cer = 0;

        System.out.println("Contador de Positivos, Negativos y Ceros");
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el " + i + "° número entero: ");
            numEnt = sc.nextInt();
            if (numEnt > 0) {
                pos++;
            } else if (numEnt < 0) {
                neg++;
            } else {
                cer++;
            }
        }
        sc.close();
        System.out.println("""
                   Resultados:
                   Positivos: """ + pos + "\n" + """
                   Negativos: """ + neg + "\n" + """
                   Ceros: """ + cer);
    }
}
