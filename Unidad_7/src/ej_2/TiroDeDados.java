//Ejercicio 7.17
package ej_2;

// Ejercicio 7.17

import java.util.Random;

public class TiroDeDados {
    public static void main(String[] args) {
        int[] frecuencia = new int[13];
        Random aleatorio = new Random();

        for (int i = 0; i < 36000000; i++) {
            int dado1 = aleatorio.nextInt(6) + 1;
            int dado2 = aleatorio.nextInt(6) + 1;
            int suma = dado1 + dado2;
            frecuencia[suma]++;
        }

        System.out.println("Suma\tFrecuencia");
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + "\t" + frecuencia[i]);
        }
    }
}
