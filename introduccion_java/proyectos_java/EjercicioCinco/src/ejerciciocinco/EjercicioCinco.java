/*
5. Escribe un programa que solicite dos números enteros y realice las siguientes
operaciones:
a. Suma
b. Resta
c. Multiplicación
d. División
Muestra los resultados en la consola.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class EjercicioCinco {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUno, numDos, suma, resta, mult, div;
        System.out.print("""
                         Hola, vamos a realizar operaciones aritmeticas.
                         Por favor digite un numero entero: """);
        numUno = Integer.parseInt(sc.nextLine());
        System.out.print("Digite otro numero entero: ");
        numDos = Integer.parseInt(sc.nextLine());
        suma = suma(numUno, numDos);
        resta = resta(numUno, numDos);
        mult = multiplicacion(numUno, numDos);
        div = division(numUno, numDos);
        System.out.println("\nResultados\n"
                + "Suma: " + suma + "\n"
                + "Resta: " + resta + "\n"
                + "Multiplicacion: " + mult + "\n"
                + "Division: " + div);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
