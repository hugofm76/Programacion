package Colecciones2;

import java.util.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 33);
        edades.put("Hugo", 29);
        edades.put("Ana", 45);
        edades.put("Luis", 47);
        edades.put("Mario", 33);
        edades.put("Rosa", 29);
        edades.put("Carmen", 33);
        edades.put("Elena", 59);
        edades.put("Benito", 33);

        int menosRepetido = valorMenosRepetido(edades);
        System.out.println("Edad menos repetida: " + menosRepetido);
    }

    public static int valorMenosRepetido(Map<String, Integer> mapa) {
        Map<Integer, Integer> conteoEdades = new HashMap<>();

        for (int edad : mapa.values()) {
            conteoEdades.put(edad, conteoEdades.getOrDefault(edad, 0) + 1);
        }

        int minFrecuencia = Integer.MAX_VALUE;
        int edadMenosRepetida = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : conteoEdades.entrySet()) {
            int edad = entry.getKey();
            int frecuencia = entry.getValue();

            if (frecuencia < minFrecuencia || (frecuencia == minFrecuencia && edad < edadMenosRepetida)) {
                minFrecuencia = frecuencia;
                edadMenosRepetida = edad;
            }
        }

        return edadMenosRepetida;
    }
}

