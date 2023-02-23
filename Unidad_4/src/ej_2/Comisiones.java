//Ejercicio 4.19

package ej_2;

import java.util.Scanner;

public class Comisiones {
	
Scanner input = new Scanner(System.in);
	
	private double articuloUno;
	private double articuloDos;
	private double articuloTres;
	private double articuloCuatro;
	private int qty1;
	private int qty2;
	private int qty3;
	private int qty4;
	
	public Comisiones(){
		
		this.articuloUno 	= 239.99;
		this.articuloDos 	= 129.75;
		this.articuloTres 	= 99.95;
		this.articuloCuatro = 350.89;
		
	}
	
	public int getQty1() {
		return qty1;
	}

	public void setQty1(int qty1) {
		if(qty1 >= 0){
			this.qty1 = qty1;
		}
		else{
			recursQty1();
		}
	}

	public int getQty2() {
		return qty2;
	}

	public void setQty2(int qty2) {
		if(qty2 >= 0){
			this.qty2 = qty2;
		}
		else{
			recursQty2();
		}
	}

	public int getQty3() {
		return qty3;
	}

	public void setQty3(int qty3) {
		if(qty3 >= 0){
			this.qty3 = qty3;
		}
		else{
			recursQty3();
		}
	}

	public int getQty4() {
		return qty4;
	}

	public void setQty4(int qty4) {
		if(qty4 >= 0){
			this.qty4 = qty4;
		}
		else{
			recursQty4();
		}
	}
	
	public void ventas(){
		
		System.out.print("Ingrese la cantidad (unidades) vendida del articulo 1: ");
		int qty1 = input.nextInt();
		this.setQty1(qty1);
		System.out.print("Ingrese la cantidad (unidades) vendida del articulo 2: ");
		int qty2 = input.nextInt();
		this.setQty2(qty2);
		System.out.print("Ingrese la cantidad (unidades) vendida del articulo 3: ");
		int qty3 = input.nextInt();
		this.setQty3(qty3);
		System.out.print("Ingrese la cantidad (unidades) vendida del articulo 4: ");
		int qty4 = input.nextInt();
		this.setQty4(qty4);
	}
	
	public void comisionXVta(){
		
		System.out.printf("\nLa comision por las ventas del Articulo 1: $%.2f", 
															(this.articuloUno*this.getQty1())*0.09);
		System.out.printf("\nLa comision por las ventas del Articulo 2: $%.2f", 
															(this.articuloDos*this.getQty2())*0.09);
		System.out.printf("\nLa comision por las ventas del Articulo 3: $%.2f", 
															(this.articuloTres*this.getQty3())*0.09);
		System.out.printf("\nLa comision por las ventas del Articulo 4: $%.2f", 
															(this.articuloCuatro*this.getQty4())*0.09);
		
		System.out.printf("\n\nLos ingresos del vendedor de la semana son: $%.2f", 200 + 
															(this.articuloUno*this.getQty1())*0.09 + 
															(this.articuloDos*this.getQty2())*0.09 + 
															(this.articuloTres*this.getQty3())*0.09 + 
															(this.articuloCuatro*this.getQty4())*0.09);
		System.out.println();
		
	}
	
	public void recursQty1(){
		
		System.out.println("***CANTIDAD ERRONEA***");
		System.out.println("Ingrese la cantidad vendida del articulo 1: ");
		int qty1 = input.nextInt();
		this.setQty1(qty1);
		
	}
	
	public void recursQty2(){
		
		System.out.println("***CANTIDAD ERRONEA***");
		System.out.println("Ingrese la cantidad vendida del articulo 2: ");
		int qty2 = input.nextInt();
		this.setQty2(qty2);
		
	}
	
	public void recursQty3(){
		
		System.out.println("***CANTIDAD ERRONEA***");
		System.out.println("Ingrese la cantidad vendida del articulo 3: ");
		int qty3 = input.nextInt();
		this.setQty3(qty3);
		
	}
	
	public void recursQty4(){
		
		System.out.println("***CANTIDAD ERRONEA***");
		System.out.println("Ingrese la cantidad vendida del articulo 4: ");
		int qty4 = input.nextInt();
		this.setQty4(qty4);
		
	}

}
