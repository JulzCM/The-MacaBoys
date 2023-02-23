//Ejercicio 3.13

package ej_1;

public class PruebaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado a = new Empleado();
		Empleado b = new Empleado();
		
		a.setNombre("Miguel");
		a.setApellido("Alvarez");
		a.setSalario_Mensual(25);
		
		b.setNombre("Sofia");
		b.setApellido("Toledo");
		b.setSalario_Mensual(24);
		
		System.out.println("Nombre: " + a.getNombre() + " " + a.getApellido() + ", " + "Salario Mensual: " + a.getSalario_Mensual());
		System.out.println("Nombre: " + b.getNombre() + " " + b.getApellido() + ", " + "Salario Mensual: " + b.getSalario_Mensual());
		
		System.out.println("Nombre: " + a.getNombre() + " " + a.getApellido() + ", " + "Salario Mensual + 10%: " + (a.getSalario_Mensual() * 1.1));
		System.out.println("Nombre: " + b.getNombre() + " " + b.getApellido() + ", " + "Salario Mensual + 10%: " + (b.getSalario_Mensual() * 1.1));
	}
}
