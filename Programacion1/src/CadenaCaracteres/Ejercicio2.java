package CadenaCaracteres;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        String[] palabras = cadena1.split("\\s+");
        contarPalabras(cadena2, palabras);
    }


    public static void contarPalabras(String cadena2, String[] palabras) {
        System.out.println("Número de veces que cada palabra de la primera cadena se encuentra en la segunda cadena:");
        for (String palabra : palabras) {
            int conteo = contarSubcadenas(cadena2, palabra);
            System.out.println("Palabra '" + palabra + "': " + conteo + " veces.");
        }
    }

    public static int contarSubcadenas(String cadena, String palabra) {
        int conteo = 0;
        int indice = cadena.indexOf(palabra); 

        while (indice != -1) {
            conteo++;
            indice = cadena.indexOf(palabra, indice + 1);
        }

        return conteo;
    }
}

