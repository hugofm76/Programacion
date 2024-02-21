package ConceptosBásicos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de adivinanza!");

        System.out.print("Introduce la longitud de la combinación (de 1 a 5): ");
        int longitud = scanner.nextInt();

        if (longitud < 1 || longitud > 5) {
            System.out.println("Longitud no válida. El juego se cerrará.");
            return;
        }

        int[] combinacionSecreta = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            combinacionSecreta[i] = random.nextInt(5) + 1;
        }

        System.out.println("Se ha generado una combinación secreta. ¡Adivina!");

        while (true) {
        
            int[] intento = new int[longitud];
            System.out.print("Introduce tu intento (separado por espacios): ");
            for (int i = 0; i < longitud; i++) {
                intento[i] = scanner.nextInt();
            }

            boolean igual = true;
            boolean mayor = false;
            boolean menor = false;
            for (int i = 0; i < longitud; i++) {
                if (intento[i] < combinacionSecreta[i]) {
                    menor = true;
                    igual = false;
                } else if (intento[i] > combinacionSecreta[i]) {
                    mayor = true;
                    igual = false;
                }
            }

            if (igual) {
                System.out.println("¡Felicidades! Has adivinado la combinación secreta.");
                break;
            } else {
                System.out.print("Tu intento es ");
                if (mayor) {
                    System.out.print("mayor");
                }
                if (mayor && menor) {
                    System.out.print(" y ");
                }
                if (menor) {
                    System.out.print("menor");
                }
                System.out.println(" que la combinación secreta. ¡Sigue intentándolo!");
            }
        }
    }
}

