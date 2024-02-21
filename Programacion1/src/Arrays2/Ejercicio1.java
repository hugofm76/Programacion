package Arrays2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el número de elementos del array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Introduce los " + n + " elementos del array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Array inicial:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " - " + array[i]);
        }
        
        System.out.print("Introduce la posición inicial: ");
        int inicial = scanner.nextInt();
        System.out.print("Introduce la posición final: ");
        int fin = scanner.nextInt();
        
        if (inicial < 0 || inicial >= n || fin < 0 || fin >= n || inicial >= fin) {
            System.out.println("Las posiciones introducidas no son válidas.");
            return;
        }
        int temp = array[inicial];
        for (int i = inicial; i < fin; i++) {
            array[i] = array[i + 1];
        }
        array[fin] = temp;
        
        System.out.println("Array final:");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " - " + array[i]);
        }
        
        scanner.close();
    }
}

