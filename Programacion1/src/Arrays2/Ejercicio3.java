package Arrays2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] mesas = new int[10]; 
        
        for (int i = 0; i < mesas.length; i++) {
            mesas[i] = random.nextInt(5);
        }

        int clientes;
        do {
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            clientes = scanner.nextInt();

            if (clientes == -1) {
                break; 
            }

            if (clientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + clientes +
                                   " personas. Haga grupos de 4 personas como máximo e intente de nuevo.");
                continue; 
            }

            boolean ubicado = false;
            for (int i = 0; i < mesas.length; i++) {
                if (clientes <= 4 - mesas[i]) {
                    mesas[i] += clientes;
                    System.out.println("Por favor, en la mesa " + (i + 1));
                    ubicado = true;
                    break;
                }
            }

            if (!ubicado) {
                System.out.println("Lo siento, no hay mesas disponibles para su grupo.");
            }

            System.out.println("Estado de las mesas:");
            for (int i = 0; i < mesas.length; i++) {
                System.out.println("Mesa " + (i + 1) + ": " + mesas[i] + " personas");
            }
        } while (clientes != -1);

        System.out.println("¡Gracias por visitar nuestro restaurante!");
        scanner.close();
    }
}

