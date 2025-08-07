/*
4. Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego
los muestre en pantalla. Usa Scanner para capturar los datos.
*/
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class EjercicioCuatro {
    
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        System.out.print("Hola, por favor ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Digite su edad: ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("¡OK! tu nombre es " + nombre + " y tenes " + edad + " años!");
    }
    
}
