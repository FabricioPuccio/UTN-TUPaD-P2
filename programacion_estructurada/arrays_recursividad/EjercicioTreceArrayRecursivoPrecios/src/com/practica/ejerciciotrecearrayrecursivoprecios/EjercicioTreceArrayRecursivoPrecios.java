/*
Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con una función recursiva en lugar de un bucle.
✔ Modificación de un valor en un array mediante un índice.
✔ Uso de un índice como parámetro en la recursión para recorrer el
array.
 */
package com.practica.ejerciciotrecearrayrecursivoprecios;

/**
 *
 * @author Fabricio
 */
public class EjercicioTreceArrayRecursivoPrecios {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        
        int indiceAModificar = 2; // Por ejemplo, modificamos el tercer producto
        double nuevoPrecio = 129.99;
        precios[indiceAModificar] = nuevoPrecio;
        
        System.out.println("\nPrecios modificados:");
        imprimirPrecios(precios, 0);
    }
    
    public static void imprimirPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.printf("Precio: $%.2f%n", precios[indice]);
            imprimirPrecios(precios, indice + 1);
        }
    }
}
