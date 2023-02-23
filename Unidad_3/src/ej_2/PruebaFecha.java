//Ejercicio 3.14

package ej_2;

public class PruebaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha a = new Fecha();
		Fecha b = new Fecha();
		
		a.setMes("Febrero");
		a.setDia("19");
		a.setAño(2023);
		
		System.out.println(a.getMes() + " / " + a.getDia() + " / " + a.getAño());
		
	}

}
