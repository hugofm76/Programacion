package CadenaCaracteres;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lineas = new ArrayList<>();

        System.out.println("Introduce líneas. Escribe 'fin' para terminar.");

        while (true) {
            String linea = scanner.nextLine().toLowerCase(); 
            if (linea.equals("fin")) {
                break;
            }
            lineas.add(linea);
        }

        for (int i = 0; i < lineas.size() - 1; i++) {
            String linea = lineas.get(i);
            char primerNoRepetido = encontrarPrimerNoRepetido(linea);
            System.out.println("Para la línea '" + linea + "', el primer carácter no repetido es: " + primerNoRepetido);
        }
    }

    public static char encontrarPrimerNoRepetido(String cadena) {
        Map<Character, Integer> conteoCaracteres = new LinkedHashMap<>();

        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)) {
                char caracter = Character.toLowerCase(c); 
                conteoCaracteres.put(caracter, conteoCaracteres.getOrDefault(caracter, 0) + 1);
            }
        }

        for (char c : cadena.toCharArray()) {
            if (conteoCaracteres.get(Character.toLowerCase(c)) == 1) {
                return c;
            }
        }

        return '\0';
    }
}
