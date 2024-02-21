package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Ingrese el tamaño del vector (entre 10 y 20 elementos): ");
            size = scanner.nextInt();
        } while (size < 10 || size > 20);

        int[] vector = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            vector[i] = rand.nextInt(100);
        }

        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        int minDiferencia = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            int diferencia = vector[i] - vector[i - 1];
            if (diferencia < minDiferencia) {
                minDiferencia = diferencia;
            }
        }
        System.out.println("Mínima diferencia entre dos valores adyacentes: " + minDiferencia);
    }
}
