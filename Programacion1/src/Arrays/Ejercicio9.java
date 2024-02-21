package Arrays;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();

        int[] vector = new int[n];

        System.out.println("Ingrese los números del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        Integer centro = encontrarCentro(vector);

        if (centro != null) {
            System.out.println("El centro del vector se encuentra en el índice: " + centro);
        } else {
            System.out.println("El vector no tiene centro.");
        }

        scanner.close();
    }

    public static Integer encontrarCentro(int[] vector) {
       
        if (vector == null || vector.length < 3) {
            return null;
        }

        for (int c = 1; c < vector.length - 1; c++) {
            int sumaIzquierda = 0;
            int sumaDerecha = 0;

            for (int i = 0; i < c; i++) {
                sumaIzquierda += (c - i) * vector[i];
            }

            for (int j = c + 1; j < vector.length; j++) {
                sumaDerecha += (j - c) * vector[j];
            }

            if (sumaIzquierda == sumaDerecha) {
                return c;
            }
        }

        return null;
    }
}

