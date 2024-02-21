package Arrays2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int[] array = new int[20];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(401);
        }
        
        System.out.println("Array original:");
        mostrarArray(array);
        
        System.out.print("¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int opcion = scanner.nextInt();
        
        for (int i = 0; i < array.length; i++) {
            if (opcion == 1 && array[i] % 5 == 0) {
                array[i] = -array[i]; 
            } else if (opcion == 2 && array[i] % 7 == 0) {
                array[i] = -array[i]; 
            }
        }
        
        System.out.println("Array con números resaltados:");
        mostrarArrayResaltado(array);
        
        scanner.close();
    }
    
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static void mostrarArrayResaltado(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print("[" + (-array[i]) + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}

