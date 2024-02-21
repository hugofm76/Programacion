package Arrays;

public class Ejercicio15 {
    public static int[][] cuadrada1(int dim) {
        int[][] matriz = new int[dim][dim];
        int valor = 1;

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i - j][j] = valor++;
            }
        }
        return matriz;
    }

    public static int[][] cuadrada2(int dim) {
        int[][] matriz = new int[dim][dim];
        int valor = 1;

        for (int i = dim - 1; i >= 0; i--) {
            for (int j = 0; j <= dim - i - 1; j++) {
                matriz[i + j][j] = valor++;
            }
        }
        return matriz;
    }

    public static String[][] palindromos(int c, int f) {
        if (c < 1 || c > 26 || f < 1 || f > 26) {
            return null;
        }

        String[][] matriz = new String[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                char primeraYUltima = (char) ('a' + i % 26);
                char segunda = (char) ('a' + (i + j) % 26);
                matriz[i][j] = "" + primeraYUltima + segunda + primeraYUltima;
            }
        }
        return matriz;
    }

    public static int max3x3sum(int[][] matriz) {
        int maxSum = Integer.MIN_VALUE;
        int n = matriz.length;
        int m = matriz[0].length;

        if (n < 3 || m < 3) {
            return -1; 
        }

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += matriz[k][l];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}

