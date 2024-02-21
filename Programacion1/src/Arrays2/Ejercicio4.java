package Arrays2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabras = new String[8];
        String[] palabrasColores = new String[8];
        String[] palabrasNoColores = new String[8];
        int contadorColores = 0;
        int contadorNoColores = 0;

        System.out.println("Ingrese 8 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = scanner.nextLine();
        }

        for (String palabra : palabras) {
            boolean esColor = false;
            for (String color : colores) {
                if (palabra.equalsIgnoreCase(color)) {
                    palabrasColores[contadorColores++] = palabra;
                    esColor = true;
                    break;
                }
            }
            if (!esColor) {
                palabrasNoColores[contadorNoColores++] = palabra;
            }
        }

        System.out.println("Array original:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        System.out.println("Array resultante:");
        for (int i = 0; i < contadorColores; i++) {
            System.out.println(palabrasColores[i]);
        }
        for (int i = 0; i < contadorNoColores; i++) {
            System.out.println(palabrasNoColores[i]);
        }

        scanner.close();
    }
}

