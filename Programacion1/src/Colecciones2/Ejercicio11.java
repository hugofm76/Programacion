package Colecciones2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio11 {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3, 4, 5);
        List<Integer> lista2 = List.of(4, 5, 6, 7, 8);
        int comunes = contarComunes(lista1, lista2);
        System.out.println("Cantidad de números comunes: " + comunes);
    }

    public static int contarComunes(List<Integer> lista1, List<Integer> lista2) {
        Set<Integer> set1 = new HashSet<>(lista1);
        Set<Integer> set2 = new HashSet<>(lista2);

        int contador = 0;
        for (Integer num : set1) {
            if (set2.contains(num)) {
                contador++;
            }
        }
        return contador;
    }
}

