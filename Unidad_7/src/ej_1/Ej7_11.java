//Ejercicio 7.11
package ej_1;

public class Ej7_11 {

 public static void main(String[] args) {

    	// Arreglo de tipo entero
        int[] cuentas = new int[10]; 
        int[] bono = new int[15]; 
        int[] mejoresPuntuaciones = {10, 20, 30, 40, 50};

        // a) Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
        for(int i = 0; i < 10; i++) {
            cuentas[i] = 0;
        }

        // b) Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.
        for(int i = 0; i < 15; i++) {
            bono[i]++;
        }

        // c) Imprima los cinco valores del arreglo mejoresPuntuaciones 
        
        for(int i = 0; i < 5; i++) {
            System.out.printf("%-5d", mejoresPuntuaciones[i]); // Imprime el valor en una columna de ancho 5
        }

    }

}