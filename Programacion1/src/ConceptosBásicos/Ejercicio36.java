package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra '" + palabra1 + "' tiene menos caracteres que '" + palabra2 + "'.");
        } else if (palabra2.length() < palabra1.length()) {
            System.out.println("La palabra '" + palabra2 + "' tiene menos caracteres que '" + palabra1 + "'.");
        } else {
            System.out.println("Ambas palabras tienen la misma cantidad de caracteres.");
        }
    }
}
