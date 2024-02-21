package Colecciones2;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        conjunto.add("casa");
        conjunto.add("perro");
        conjunto.add("gato");
        conjunto.add("mesa");
        conjunto.add("coche");

        System.out.println("Conjunto original: " + conjunto);

        eliminarLasDeLongitudPar(conjunto);

        System.out.println("Conjunto después de eliminar cadenas de longitud par: " + conjunto);
    }

    public static void eliminarLasDeLongitudPar(Set<String> conjunto) {
        
        Iterator<String> iterator = conjunto.iterator();
        while (iterator.hasNext()) {
            String cadena = iterator.next();
            if (cadena.length() % 2 == 0) {
                iterator.remove(); 
            }
        }
    }
}
