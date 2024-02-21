package Arrays;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de veces que quieres lanzar el dado: ");
        int N = scanner.nextInt();

        int[] contadorCaras = new int[6]; 

        for (int i = 0; i < N; i++) {
            int caraLanzada = lanzarDado();
            contadorCaras[caraLanzada - 1]++; 
        }

        for (int i = 0; i < contadorCaras.length; i++) {
            System.out.println("Cara " + (i + 1) + ": " + contadorCaras[i] + " veces");
        }
    }

    public static int lanzarDado() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
