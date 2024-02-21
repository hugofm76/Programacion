package Arrays;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
      
        Random rand = new Random();
        int tamañoVector = rand.nextInt(41) + 10; 
        int[] vectorOriginal = new int[tamañoVector];

        Set<Integer> numerosUsados = new HashSet<>();
        for (int i = 0; i < tamañoVector; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = rand.nextInt(201) - 100; 
            } while (numerosUsados.contains(numeroAleatorio));
            vectorOriginal[i] = numeroAleatorio;
            numerosUsados.add(numeroAleatorio);
        }
        int[] vectorInverso = new int[tamañoVector];
        for (int i = 0; i < tamañoVector; i++) {
            vectorInverso[i] = vectorOriginal[tamañoVector - 1 - i];
        }

        System.out.println("Vector Original:");
        mostrarVector(vectorOriginal);
        System.out.println("\nVector Inverso:");
        mostrarVector(vectorInverso);
    }

    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
