package Colecciones2;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> lista1 = Arrays.asList("a", "b", "c", "a", "a", "d");
        List<String> lista2 = Arrays.asList("a", "b", "c", "a", "a", "a");

        System.out.println("¿Algún elemento se repite al menos 3 veces en la lista1? " + algunaSeRepiteAlMenos3Veces(lista1));
        System.out.println("¿Algún elemento se repite al menos 3 veces en la lista2? " + algunaSeRepiteAlMenos3Veces(lista2));
    }

    public static boolean algunaSeRepiteAlMenos3Veces(List<String> lista) {
       
        Map<String, Integer> conteo = new HashMap<>();

        for (String cadena : lista) {
            conteo.put(cadena, conteo.getOrDefault(cadena, 0) + 1);
        }

        for (int frecuencia : conteo.values()) {
            if (frecuencia >= 3) {
                return true;
            }
        }
        return false;
    }
}

