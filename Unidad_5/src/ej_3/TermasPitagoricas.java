//Ejercicio 5.21

package ej_3;


public class TermasPitagoricas{ 
	public static void main(String[] args) {
		int limit = 500;
		      
			System.out.println("Pythagorean Triples (side1, side2, hypotenuse):");
	      for (int side1 = 1; side1 <= limit; side1++) {
	    	  for (int side2 = 1; side2 <= limit; side2++) {
	    		  for (int hypotenuse = 1; hypotenuse <= limit; hypotenuse++) {
	    			  if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
		                  System.out.printf("(%d, %d, %d)%n", side1, side2, hypotenuse);
		            }
		         }
		      }
		 }
	}
}

	
