package Colecciones2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<String> palabras = List.of("banana", "pera", "melón", "o", "sandía");
        Map<String, Integer> ocurrencias = cuentaPares(palabras);
        System.out.println("Ocurrencias de pares de caracteres:");
        System.out.println(ocurrencias);
    }

    public static Map<String, Integer> cuentaPares(List<String> palabras) {
        Map<String, Integer> ocurrencias = new HashMap<>();

        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length() - 1; i++) {
                String par = palabra.substring(i, i + 2);
                ocurrencias.put(par, ocurrencias.getOrDefault(par, 0) + 1);
            }
        }

        return ocurrencias;
    }
}
