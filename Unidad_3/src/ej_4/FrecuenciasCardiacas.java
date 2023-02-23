//Ejercicio 3.16

package ej_4;

public class FrecuenciasCardiacas
{
	private String nombre;
	private int DiaCumpleaños, MesCumpleaños, AñoCumpleaños;
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public void setDiaCumpleaños(int dia)
	{
		this.DiaCumpleaños = dia;
	}
	
	public void setMesCumpleaños(int Mes)
	{
		this.MesCumpleaños = Mes;
	}
	
	public void setAñoCumpleaños(int Año)
	{
		AñoCumpleaños = Año;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public int getEdad()
	{
		int HoyDia = 21;
		int HoyMes = 2;
		int HoyAño = 2023;
		
		int estampaHoy = 10000 * HoyAño + 100 * HoyMes + HoyDia;
		int estampaCumple = 10000 * AñoCumpleaños + 100 * MesCumpleaños + DiaCumpleaños;
		
		return (int) (estampaHoy - estampaCumple) / 10000;
	}
	
	public int getMaximoRitmoCardiaco()
	{
		return 220 - getEdad();
	}
	
	public String getFrecuanciaCardiacaEsperada()
	{
		return String.format("[%.1f - %.1f]",
							(float) getMaximoRitmoCardiaco() * 0.50,
							(float) getMaximoRitmoCardiaco() * 0.85);
	}
}
	

