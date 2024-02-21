package Arrays;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
       
        int[][] matriz = crearMatrizAleatoria();

        System.out.println("Matriz:");
        mostrarMatriz(matriz);

        int[] sumaFilas = sumarFilas(matriz);

        System.out.println("\nSuma de las filas a la derecha:");
        mostrarVector(sumaFilas);

        int[] sumaColumnas = sumarColumnas(matriz);

        System.out.println("\nSuma de las columnas en la parte inferior:");
        mostrarVector(sumaColumnas);
    }

    public static int[][] crearMatrizAleatoria() {
        Random rand = new Random();
        int filas = rand.nextInt(19) + 2; 
        int columnas = rand.nextInt(19) + 2; 

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100); 
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static int[] sumarFilas(int[][] matriz) {
        int[] sumaFilas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }
        return sumaFilas;
    }

    public static int[] sumarColumnas(int[][] matriz) {
        int[] sumaColumnas = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }
        return sumaColumnas;
    }

    public static void mostrarVector(int[] vector) {
        for (int valor : vector) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }
}
