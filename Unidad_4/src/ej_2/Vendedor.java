//Ejercicio 4.19

package ej_2;

import java.util.Scanner;

public class Vendedor {
	
public static void main(String[] args){
		
		try (Scanner input = new Scanner(System.in)) {
			Comisiones vendedor1 = new Comisiones();
			
			System.out.println("Programa que calcula las comisiones de los vendedores");
			
			while(true){
				
				System.out.print("\nSeleccione una opcion" + 
				"\n\n1) Calcular comision de vendedor" + 
				"\n2) Salir" + 
				"\n----> ");
				
				int x = input.nextInt();
				
				if(x == 1){
					vendedor1.ventas();
					vendedor1.comisionXVta();
				}
				else if(x == 2){
					System.out.println("PROGRAMA TERMINADO");
					break; //Este break rompe el bucle
				}
				else{
					System.out.println("***OPCION INCORRECTA, VUELVA A INGRESAR SU ELECCION***");
				}
				
			}
		}
		
	}

}
