package Colecciones;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una línea de texto:");
        String linea = scanner.nextLine();

        String[] palabras = linea.split(" ");

        Set<String> palabrasUnicas = new HashSet<>();
        Set<String> palabrasRepetidas = new HashSet<>();

        for (String palabra : palabras) {
            if (!palabrasUnicas.contains(palabra)) {
                palabrasUnicas.add(palabra); 
            } else {
                palabrasRepetidas.add(palabra); 
            }
        }

        System.out.println("Palabras que no se repiten:");
        System.out.println(palabrasUnicas);

        System.out.println("Palabras que se repiten:");
        System.out.println(palabrasRepetidas);
    }
}
