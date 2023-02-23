//Ejercicio 3.13

package ej_1;

public class Empleado {

	//Variables de instancia
	
	public String Nombre;
	public String Apellido;
	public int Salario_Mensual;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String txt) {
		Nombre = txt;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String txt) {
		Apellido = txt;
	}
	public int getSalario_Mensual() {
		return Salario_Mensual;
	}
	public void setSalario_Mensual(int n) {
		Salario_Mensual = n;
	}
	
}
