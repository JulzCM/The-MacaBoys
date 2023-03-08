package ejercicio_6_35;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI {

	private static SecureRandom numAletorio = new SecureRandom();
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		while (true) {

			int resultado = genPregunta();

			while (true) {

				int resp = input.nextInt();

				if (resp == resultado) {
					System.out.println("¡Muy bien!");
					break;
				} else
					System.out.println("No. Por favor intenta de nuevo.");

			}

		}

	}

	public static int genPregunta() {

		int a = 1 + numAletorio.nextInt(10);
		int b = 1 + numAletorio.nextInt(10);

		int res = a * b;

		System.out.printf("¿Cuanto es %d por %d?%n", a, b);

		return res;
	}

}
