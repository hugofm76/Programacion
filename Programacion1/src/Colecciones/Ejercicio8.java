package Colecciones;

import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> manos = new HashMap<>();

        String linea;
        while (!(linea = scanner.nextLine()).equals("fin")) {
            String[] partes = linea.split(":");
            String nombre = partes[0].trim();
            String[] naipes = partes[1].trim().split(" ");
            if (!manos.containsKey(nombre)) {
                manos.put(nombre, new HashSet<>());
            }
            Set<String> mano = manos.get(nombre);
            Collections.addAll(mano, naipes);
        }

        for (Map.Entry<String, Set<String>> entry : manos.entrySet()) {
            String nombre = entry.getKey();
            Set<String> mano = entry.getValue();
            int valorMano = calcularValorMano(mano);
            System.out.println(nombre + ": " + valorMano);
        }
    }

    public static int calcularValorMano(Set<String> mano) {
        int valorTotal = 0;
        Map<Character, Integer> valoresRango = new HashMap<>();
        valoresRango.put('2', 2);
        valoresRango.put('3', 3);
        valoresRango.put('4', 4);
        valoresRango.put('5', 5);
        valoresRango.put('6', 6);
        valoresRango.put('7', 7);
        valoresRango.put('8', 8);
        valoresRango.put('9', 9);
        valoresRango.put('T', 10);
        valoresRango.put('J', 11);
        valoresRango.put('Q', 12);
        valoresRango.put('K', 13);
        valoresRango.put('A', 14);

        Map<Character, Integer> valoresPalo = new HashMap<>();
        valoresPalo.put('S', 4);
        valoresPalo.put('H', 3);
        valoresPalo.put('D', 2);
        valoresPalo.put('C', 1);

        for (String naipe : mano) {
            char rango = naipe.charAt(0);
            char palo = naipe.charAt(1);
            valorTotal += valoresRango.get(rango) * valoresPalo.get(palo);
        }

        return valorTotal;
    }
}

