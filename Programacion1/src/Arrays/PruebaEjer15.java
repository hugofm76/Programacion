package Arrays;

public class PruebaEjer15 {
    public static void main(String[] args) {
        
        int[][] cuadrada1 = Ejercicio15.cuadrada1(4);
        System.out.println("Matriz cuadrada 1:");
        mostrarMatriz(cuadrada1);

        int[][] cuadrada2 = Ejercicio15.cuadrada2(4);
        System.out.println("\nMatriz cuadrada 2:");
        mostrarMatriz(cuadrada2);

        String[][] palindromos = Ejercicio15.palindromos(6, 4);
        System.out.println("\nMatriz de palíndromos:");
        mostrarMatriz(palindromos);

        int[][] matriz = {
                {1, 5, 5, 2, 2},
                {1, 4, 4, 3, 2},
                {14, 3, 3, 4, 7},
                {8, 11, 12, 2, 8},
                {16, 4, 0, 0, 0}
        };
        int maxSum = Ejercicio15.max3x3sum(matriz);
        System.out.println("\nMáxima suma de submatrices 3x3: " + maxSum);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}

