package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Introduce el número de columnas (m): ");
        int m = scanner.nextInt();

        int[][] arrayBidimensional = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrayBidimensional[i][j] = i + j;
            }
        }

        System.out.println("El array bidimensional rellenado es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arrayBidimensional[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
