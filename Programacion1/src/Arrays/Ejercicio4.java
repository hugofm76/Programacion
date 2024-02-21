package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño del vector (entre 10 y 200): ");
        int tamañoVector = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        if (tamañoVector < 10 || tamañoVector > 200) {
            System.out.println("Tamaño de vector no válido.");
            return;
        }

        int[] vector = new int[tamañoVector];

        Random rand = new Random();
        for (int i = 0; i < tamañoVector; i++) {
            vector[i] = rand.nextInt(201) - 100;
        }

        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        int suma = 0;
        int numerosNoSumados = 0;
        for (int i = 0; i < tamañoVector; i++) {
            if (vector[i] != 13) {
                suma += vector[i];
            } else {
                int sumaSiguiente13 = 0;
                for (int j = i + 1; j < i + 14 && j < tamañoVector; j++) {
                    sumaSiguiente13 += vector[j];
                }
                if (sumaSiguiente13 != 7) {
                    suma += vector[i];
                    suma += sumaSiguiente13;
                } else {
                    numerosNoSumados += 14;
                    i += 13;
                }
            }
        }

        System.out.println("La suma de los números almacenados (considerando la condición del 13) es: " + suma);
        System.out.println("Cantidad de números que no se han sumado: " + numerosNoSumados);
    }
}

