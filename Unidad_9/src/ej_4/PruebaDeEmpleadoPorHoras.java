//Ejercicio 9.15
package ej_4;

public class PruebaDeEmpleadoPorHoras {

public static void main(String[] args) {
		
	EmpleoPorHoras empleado1=new EmpleoPorHoras("Bob", "Lewis", "222222", .4, 300);
		
		
	System.out.print("Empleado por comision.");
	System.out.print("Nombre: "+empleado1.obtenerPrimerNombre());
	System.out.print("Primer apellido: "+empleado1.obtenerApellidoPaterno());
	System.out.print("Numero Socuial: "+empleado1.obtenerNumeroSeguroSocial());
	System.out.print("Sueldo Mas Comision: "+empleado1.ingresos());
		
	empleado1.establecerHoras(85); 
	empleado1.establecerSueldo(599);
	System.out.printf("%n%s:%n%n%s%n", "Información actualizada del empleado obtenida por toString", empleado1.toString());
	System.out.printf("Los ingresos son: $%,.2f%n", empleado1.ingresos());

	}

}