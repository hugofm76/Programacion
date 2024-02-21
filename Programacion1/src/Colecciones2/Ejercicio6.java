package Colecciones2;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 2, 4, 6, 2, 3, 2);
        int resultado = moda(numeros);
        System.out.println("La moda es: " + resultado);
    }

    public static int moda(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            return 0;
        }

        Map<Integer, Integer> frecuencias = new HashMap<>();

        for (int num : numeros) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
        }

        int moda = 0;
        int maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencias.entrySet()) {
            int num = entry.getKey();
            int frecuencia = entry.getValue();
            if (frecuencia > maxFrecuencia) {
                moda = num;
                maxFrecuencia = frecuencia;
            }
        }

        return moda;
    }
}

