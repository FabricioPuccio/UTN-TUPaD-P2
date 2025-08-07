/*
8. Manejar conversiones de tipo y división en Java.
a. Escribe un programa que divida dos números enteros ingresados por el
usuario.
b. Modifica el código para usar double en lugar de int y compara los
resultados.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class EjercicioOcho {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numUno, numDos;
        double div, resultado;
        System.out.print("Por favor ingrese un número entero: ");
        numUno = Integer.parseInt(sc.nextLine());
        System.out.print("Por favor ingrese otro número entero: ");
        numDos = Integer.parseInt(sc.nextLine());
        div = numUno / numDos;
        System.out.println("Resultado de la división: " + div);
        resultado = (double) numUno / numDos;
        System.out.println("Resultado de la división usando casting: " + resultado);
    }
    
}
