package Colecciones;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        List<Integer> listaOriginal = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            listaOriginal.add(random.nextInt(100) + 1);
        }

        System.out.println("Números en la lista original:");
        for (int numero : listaOriginal) {
            System.out.print(numero + " ");
        }
        System.out.println();

        Set<Integer> conjuntoSinRepetidos = new HashSet<>(listaOriginal);

        System.out.println("Números sin repetidos:");
        for (int numero : conjuntoSinRepetidos) {
            System.out.print(numero + " ");
        }
        System.out.println();

        Set<Integer> conjuntoOrdenadoSinRepetidos = new TreeSet<>(listaOriginal);

        System.out.println("Números ordenados y sin repetidos:");
        for (int numero : conjuntoOrdenadoSinRepetidos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
