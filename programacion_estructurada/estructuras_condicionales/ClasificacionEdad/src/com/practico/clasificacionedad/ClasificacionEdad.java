/*
3. Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
 */
package com.practico.clasificacionedad;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class ClasificacionEdad {

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.print("Hola! por favor ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 0){
            System.out.println("Error! La edad no puede ser negativa.");
        } else if(edad < 12) {
            System.out.println("Eres un/a niño/a");
        } else if (edad <= 17) {
            System.out.println("Eres un/a adolescente");
        } else if (edad <= 59) {
            System.out.println("Eres un/a adulto/a");
        } else {
            System.out.println("Eres un/a adulto/a mayor");
        }
        
        sc.close();
    }
    

}
