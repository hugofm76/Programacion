package Colecciones;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los tamaños de los conjuntos n y m:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Ingrese los elementos del primer conjunto:");
        for (int i = 0; i < n; i++) {
            conjunto1.add(scanner.nextInt());
        }

        System.out.println("Ingrese los elementos del segundo conjunto:");
        for (int i = 0; i < m; i++) {
            conjunto2.add(scanner.nextInt());
        }

        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);

        System.out.println("Números en ambos conjuntos:");
        for (int num : interseccion) {
            System.out.print(num + " ");
        }
    }
}
