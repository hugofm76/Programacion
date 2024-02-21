package Colecciones2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args) {
        Map<String, String> mapa1 = Map.of("clave1", "valor1", "clave2", "valor2", "clave3", "valor3");
        Map<String, String> mapa2 = Map.of("clave1", "valor1", "clave2", "valor2", "clave3", "valor1");

        System.out.println("El mapa1 tiene valores únicos: " + valoresUnicos(mapa1));
        System.out.println("El mapa2 tiene valores únicos: " + valoresUnicos(mapa2));
    }

    public static boolean valoresUnicos(Map<String, String> mapa) {
        
        Set<String> valoresUnicos = new HashSet<>();

        for (String valor : mapa.values()) {
          
            if (valoresUnicos.contains(valor)) {
                return false;
            }
            valoresUnicos.add(valor);
        }
        
        return true;
    }
}
