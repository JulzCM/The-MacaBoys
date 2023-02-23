//Ejercicio 5.17

package ej_2;


import java.util.Scanner;

public class CalcularVentas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      int productNumber, quantity;
	      double totalPrice = 0.0;
	      
	      do {
	         System.out.print("Enter the product number (1-5): ");
	         productNumber = input.nextInt();
	         
	         if (productNumber >= 1 && productNumber <= 5) {
	            System.out.print("Enter the quantity sold: ");
	            quantity = input.nextInt();
	            
	            switch (productNumber) {
	               case 1:
	                  totalPrice += quantity * 2.98;
	                  break;
	               case 2:
	                  totalPrice += quantity * 4.50;
	                  break;
	               case 3:
	                  totalPrice += quantity * 9.98;
	                  break;
	               case 4:
	                  totalPrice += quantity * 4.49;
	                  break;
	               case 5:
	                  totalPrice += quantity * 6.87;
	                  break;
	            }
	         } else if (productNumber != 0) {
	            System.out.println("Invalid product number. Please try again.");
	         }
	      } while (productNumber != 0);
	      
	      System.out.printf("Total retail value of all products sold: $%.2f", totalPrice);
	}
}
