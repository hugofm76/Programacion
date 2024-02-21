package Arrays;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        scanner.nextLine(); 

        char[][] matriz = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            String fila = scanner.nextLine();
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = fila.charAt(j);
            }
        }

        char caracterRelleno = scanner.nextLine().charAt(0);

        int filaInicial = scanner.nextInt();
        int columnaInicial = scanner.nextInt();

        rellenar(matriz, filaInicial, columnaInicial, matriz[filaInicial][columnaInicial], caracterRelleno);

        mostrarMatriz(matriz);
    }

    public static void rellenar(char[][] matriz, int filaInicial, int columnaInicial, char caracterInicial, char caracterRelleno) {
        if (filaInicial < 0 || filaInicial >= matriz.length || columnaInicial < 0 || columnaInicial >= matriz[0].length) {
            return;
        }

        char caracterActual = matriz[filaInicial][columnaInicial];

        if (caracterActual != caracterInicial) {
            return;
        }

        matriz[filaInicial][columnaInicial] = caracterRelleno;

        rellenar(matriz, filaInicial - 1, columnaInicial, caracterInicial, caracterRelleno);
      
        rellenar(matriz, filaInicial + 1, columnaInicial, caracterInicial, caracterRelleno);
        
        rellenar(matriz, filaInicial, columnaInicial - 1, caracterInicial, caracterRelleno);
       
        rellenar(matriz, filaInicial, columnaInicial + 1, caracterInicial, caracterRelleno);
    }

    public static void mostrarMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char c : fila) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
