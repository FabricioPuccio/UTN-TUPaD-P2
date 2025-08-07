/*
Crea un programa que declare las siguientes variables con valores asignados:
a. String nombre
b. int edad
c. double altura
d. boolean estudiante
Imprime los valores en pantalla usando System.out.println().
*/
package com.fabriciopuccio.ejerciciotres;
/**
 *
 * @author Fabricio
 */
public class EjercicioTres {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Fabricio";
        int edad = 36;
        double altura = 1.75;
        boolean estudiante = true;
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años y"
                + " mi estatura es de " + altura + " m.\n¿Estudio Programación a "
                        + "distancia? " + estudiante );
    }
    
}
