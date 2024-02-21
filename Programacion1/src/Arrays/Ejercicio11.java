package Arrays;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de secuencias: ");
        int numeroSecuencias = scanner.nextInt();

        int[] array = new int[obtenerTamanioTotal(scanner, numeroSecuencias)];

        int indice = 0;
        for (int i = 0; i < numeroSecuencias; i++) {
            int longitudSecuencia = scanner.nextInt();
            for (int j = 0; j < longitudSecuencia; j++) {
                array[indice] = scanner.nextInt();
                indice++;
            }
        }

        System.out.println("Números almacenados en el array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int obtenerTamanioTotal(Scanner scanner, int numeroSecuencias) {
        int tamanio = 0;
        for (int i = 0; i < numeroSecuencias; i++) {
            int longitudSecuencia = scanner.nextInt();
            tamanio += longitudSecuencia;
        }
        return tamanio;
    }
}
