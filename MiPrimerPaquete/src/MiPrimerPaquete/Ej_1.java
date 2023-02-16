package MiPrimerPaquete;

// Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
// los números del usuario y muestre el número más grande, seguido de las palabras “es más grande”.
// Si los números son iguales, imprima el mensaje “Estos números son iguales”.

import java.util.Scanner;

public class Ej_1 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int a, b;

			while (true) {
				System.out.println("INGRESE EL PRIMER NUMERO");
				a = entrada.nextInt();

				System.out.println("INGRESE EL SEGUNDO NUMERO");
				b = entrada.nextInt();

				if (a == b) {
					System.out.println("LOS NUMEROS SON IGUALES");
				}

				else if (a > b) {
					System.out.println(" ES MAS GRANDE " + a);
				}

				else {
					System.out.println(" ES MAS GRANDE " + b);

				}
			}

		}

	}

}