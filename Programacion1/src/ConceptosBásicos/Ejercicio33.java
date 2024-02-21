package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseProcesada = eliminarEspaciosYTildes(frase.toLowerCase());

        if (esPalindromo(fraseProcesada)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static String eliminarEspaciosYTildes(String cadena) {
        return cadena.replaceAll("[^a-zA-Z]", "");
    }

    public static boolean esPalindromo(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
