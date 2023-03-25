//Ejercicio 9.14
package ej_3;

public class PruebaEmpleadoPorComision
{
	public static void main(String[] args) 
	{

		EmpleadoPorComision empleado1=new EmpleadoPorComision("Bob", "Lewis", "222222", .4, 300);
		
		System.out.print("Empleado por comision.");
		System.out.print("Nombre: "+empleado1.obtenerPrimerNombre());
		System.out.print("Primer apellido: "+empleado1.obtenerApellidoPaterno());
		System.out.print("Numero Socuial: "+empleado1.obtenerNumeroSeguroSocial());
		System.out.print("Sueldo Mas Comision: "+empleado1.ingresos());

	}

}