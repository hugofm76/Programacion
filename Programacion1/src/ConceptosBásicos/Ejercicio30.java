package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lineas = new String[10];

        for (int i = 0; i < 10; i++) {
            lineas[i] = scanner.nextLine();
        }

        ordenarPorLongitud(lineas);

        for (String linea : lineas) {
            System.out.println(linea);
        }
    }

    public static void ordenarPorLongitud(String[] lineas) {
        for (int i = 0; i < lineas.length - 1; i++) {
            for (int j = 0; j < lineas.length - 1 - i; j++) {
                if (lineas[j].length() > lineas[j + 1].length()) {
                    String temp = lineas[j];
                    lineas[j] = lineas[j + 1];
                    lineas[j + 1] = temp;
                }
            }
        }
    }
}
