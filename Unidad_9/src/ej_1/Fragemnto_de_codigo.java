//Ejercicio 9.9
package ej_1;
// Ejercicio 9.9 , ¿QUe hace cada fragmento de codigo?

public class Fragemnto_de_codigo {

	a) Suponga que la siguiente llamada a método se encuentra en un método ingresos sobrescrito en una subclase:
		
		super.ingresos()
	
	/*
	1) La nueva vesión obtiene la porcion de los ingresos del empleado con base en la comisión llamando el metodo ingresos del EmpledoPorComisión
	2) Utiliza la sintaxis: palabra clave "super" un espaciador por punto (.) antes del nombre del metodo de la superclase.
	3) Es una buena practica, ya que si un metodo realiza todas o algunas de las acciones que necesia otro metodo se hace la llamada a este en vez de duplicar su codigo	
	
	*/
		
		
	b) Suponga que la siguiente línea de código aparece antes de la declaración de un método:
		
		@Override	
	
	/*
	  1) Se utiliza de manera opcional para indicar que la declaración del siguiente método debe sobrescribir un método de la superclase.
	  2) La anotación ayuda al compilador a atrapar unos cuantos errores
	  3) Cuando se usa Override el compilador caompara la firma del método con las firmas del metodo de la superclase. Si no hay coincidencia exacta el compilador emite un error, lo que sigue es corregir la firma del método para que coincida con la del método de la superclase.
	 	
	 */
	
	c) Suponga que aparece la siguiente línea de código como la primera instrucción en el cuerpo de un constructor:
			
		super(primerArgumento, segundoArgumento);
	
	/*
	1) Se esta declarando un metodo con dos parametros cada uno con valores diferentes, la sintaxis se declaran los dos parametros mediante una coma.  
	 
	 */
	
}
