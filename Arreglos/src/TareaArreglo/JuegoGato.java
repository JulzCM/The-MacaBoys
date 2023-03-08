package TareaArreglo;

import java.util.Scanner;

	public class JuegoGato {
		

		
	public static void main(String[] args) {

		 char [][] tablero = {{'O','X','O'},
				 			  {'X','O','X'},
				 			  {'O','X','O'}};
		 
		char ganador = Ganador(tablero);
        if (ganador == 0) {
            System.out.println("El juego ha quedado en empate.");
        } else {
            System.out.println("El ganador es: " + ganador);
        }
    }

    public static char Ganador(char [][] tablero) {
        // Revisar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return tablero[i][0];
            }
        }

        // Revisar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                return tablero[0][j];
            }
        }

        // Revisar diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return tablero[0][0];
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return tablero[0][2];
        }

        // Empate
        return 0;
    }
}
