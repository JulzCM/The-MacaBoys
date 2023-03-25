//Ejercicio 9.14 y 9.15
package ej_4;

public class Empleado {

	private String primerNombre; 
	private String apellidoPaterno; 
	private String numeroSeguroSocial;

	public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial)
	{
	this.primerNombre = primerNombre; 
	this.apellidoPaterno = apellidoPaterno; 
	this.numeroSeguroSocial = numeroSeguroSocial;
	}

	public String obtenerPrimerNombre() 
	{
		return primerNombre;
	}

	public String obtenerApellidoPaterno() 
	{ 
		return apellidoPaterno;
	}

	public String obtenerNumeroSeguroSocial() 
	{
		return numeroSeguroSocial;
}

	public String toString() 
	{
	 
	return String.format("%s %s%nnúmero de seguro social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(),obtenerNumeroSeguroSocial());
	}
	


}