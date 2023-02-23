//Ejercicio 5.31

package ej_5;

import java.util.Scanner;

public class CalentamientoGlobal {

    public static void main(String[] args) {

        String[] preguntas = {
                "¿Qué es el efecto invernadero?",
                "¿Cuál es el principal gas de efecto invernadero?",
                "¿Cuál es la principal causa del calentamiento global?",
                "¿Qué es el Protocolo de Kioto?",
                "¿Cuál es una medida para reducir las emisiones de gases de efecto invernadero?"
        };
        String[][] opciones = {
                {"Un fenómeno natural que mantiene la Tierra caliente", "Un fenómeno creado por el hombre que enfría la Tierra", "Un fenómeno natural que enfría la Tierra", "Un fenómeno creado por el hombre que calienta la Tierra"},
                {"Dióxido de carbono", "Nitrógeno", "Oxígeno", "Metano"},
                {"La quema de combustibles fósiles", "La actividad solar", "La actividad volcánica", "La deforestación"},
                {"Un acuerdo internacional para reducir las emisiones de gases de efecto invernadero", "Un acuerdo internacional para aumentar las emisiones de gases de efecto invernadero", "Un acuerdo internacional para proteger a las empresas petroleras", "Un acuerdo internacional para reducir la capa de ozono"},
                {"El uso de energías renovables", "El aumento de la deforestación", "El aumento del uso de combustibles fósiles", "El aumento del uso de plásticos"}
        };
        int[] respuestas = {4, 1, 1, 1, 1};

        int correctas = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println((i + 1) + ". " + preguntas[i]);
            for (int j = 0; j < opciones[i].length; j++) {
	                System.out.println((j + 1) + ") " + opciones[i][j]);
            }
            int respuesta = scanner.nextInt();
            if (respuesta == respuestas[i]) {
                correctas++;
            }
        }

        System.out.println("Ha respondido correctamente a " + correctas + " de las 5 preguntas.");
        if (correctas == 5) {
            System.out.println("Excelente");
        } else if (correctas == 4) {
            System.out.println("Muy bien");
        } else {
            System.out.println("Es tiempo de aprender más sobre el calentamiento global.");
            System.out.println("Algunos sitios web útiles para aprender más son:");
            System.out.println("- https://www.nasa.gov/mission_pages/oco/news/index.html");
            System.out.println("- https://www.epa.gov/climate-research");
            System.out.println("- https://www.climate.gov/");
        }
    }
}

