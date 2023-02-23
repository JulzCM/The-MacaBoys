//Ejercicio 3.16

package ej_4;

public class TestFrecuenciasCardiacas {

	public static void main(String[] args) {
		FrecuenciasCardiacas ritmo = new FrecuenciasCardiacas();
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		System.out.print("Nombre: ");
		ritmo.setNombre(input.nextLine());
		
		System.out.print("Dia de Cumpleaños: ");
		ritmo.setDiaCumpleaños(input.nextInt());
		
		System.out.print("Mes de Cumpleaños: ");
		ritmo.setMesCumpleaños(input.nextInt());
		
		System.out.print("Año de Cumpleaños: ");
		ritmo.setAñoCumpleaños(input.nextInt());
		
		
		
		System.out.printf("%nResultado:%n");
		System.out.printf("Nombre: %s%n", ritmo.getNombre());
		System.out.printf("Años cumplidos: %s%n", ritmo.getEdad());
		System.out.printf("Maximo ritmo cardiaco: %s%n", ritmo.getMaximoRitmoCardiaco());
		System.out.printf("Intervalo de Frecuancia Cardiaca Esperada: %s%n", ritmo.getFrecuanciaCardiacaEsperada());
	}

}
