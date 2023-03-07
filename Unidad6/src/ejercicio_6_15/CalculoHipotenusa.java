package ejercicio_6_15;

import java.util.Scanner;

public class CalculoHipotenusa {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Ingrese la longitud del lado 1: ");
		double lado1 = scanner.nextDouble();
		System.out.print("Ingrese la longitud del lado 2: ");
		double lado2 = scanner.nextDouble();

		double hipotenusa = hipotenusa(lado1, lado2);

		System.out.println("La hipotenusa es: " + hipotenusa);
	}

	public static double hipotenusa(double lado1, double lado2) {
		double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
		return hipotenusa;
	}

}
