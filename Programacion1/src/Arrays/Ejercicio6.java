package Arrays;

import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int size = rand.nextInt(491) + 10; 
        int[] vector = new int[size];

        for (int i = 0; i < size; i++) {
            vector[i] = rand.nextInt(201) - 100; 
        }

        if (size <= 50) {
            System.out.println("Contenido del vector:");
            for (int num : vector) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int secuencias = 0;
        for (int i = 0; i < size - 1; i++) {
            if (vector[i] == vector[i + 1]) {
                secuencias++;
               
                while (i < size - 1 && vector[i] == vector[i + 1]) {
                    i++;
                }
            }
        }

        System.out.println("Número de secuencias de números repetidos: " + secuencias);
    }
}

