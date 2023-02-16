package MiPrimerPaquete;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej_5 {
	

	public static void main(String[] args) throws IOException {  
		InputStreamReader flujoEntrada = new InputStreamReader (System.in);
		BufferedReader teclado = new BufferedReader(flujoEntrada);
		
		String salir = "No";
		while (salir != "Si") {
        float altura = 0, peso = 0, imc = 0;

        try (Scanner lectura = new Scanner(System.in)) {
			System.out.println("Introduce tu altura en Metros: ");
			altura = lectura.nextFloat();
			System.out.println("Introduce tu peso en Kg: ");
			peso = lectura.nextFloat();
		}

        imc = peso/(altura * altura);
        if(imc <= 18.4){
            System.out.println("Tu peso Esta bajo");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.print("Tu peso esta normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.print("Tienes Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.print("Tienes Obesidad Grado 1");
        }
        
        System.out.println("Desea continuar? (Si/No)");
        salir = teclado.readLine();
		}
        
    }
	
}
