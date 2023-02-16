package MiPrimerPaquete;

// Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
// promedio, producto, menor y mayor de esos números.

import java.util.Scanner;

public class Ej_2 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {

			int a, b, c, sum = 0, promedio = 0, producto = 0;

			System.out.println("INGRESE EL PRIMER NUMERO");
			a = entrada.nextInt();

			System.out.println("INGRESE EL SEGUNDO NUMERO");
			b = entrada.nextInt();

			System.out.println("INGRESE EL TERCER NUMERO");
			c = entrada.nextInt();

			sum = a + b + c;
			promedio = (a + b + c) / 3;
			producto = a * b * c;

			System.out.println("La suma es = " + sum);

			System.out.println("El promedio es = " + promedio);

			System.out.println("El producto es = " + producto);

			if (a > b & a > c) {
				System.out.print(a);
				System.out.println(" ES MAYOR");
			}
			if (b > a & b > c) {
				System.out.print(b);
				System.out.println(" ES MAYOR");
			}
			if (c > a & c > b) {
				System.out.print(c);
				System.out.println(" ES MAYOR");
			}
			if (a < b & a < c) {
				System.out.print(a);
				System.out.println(" ES MENOR");
			}
			if (b < a & b < c) {
				System.out.print(b);
				System.out.println(" ES MENOR");
			}
			if (c < a & c < b) {
				System.out.print(c);
				System.out.println(" ES MENOR");
			}

		}

	}

}
