/*
7. Validación de Nota entre 0 y 10 (do-while).
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
hasta que ingrese un valor válido.
 */
package com.practica.validacionnota;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ValidacionNota {

    static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        double nota;

        do {
            
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        sc.close();
        
        System.out.println("Nota guardada correctamente!");
    }

}
