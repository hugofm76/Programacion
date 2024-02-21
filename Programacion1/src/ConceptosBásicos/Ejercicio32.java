package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        String fraseMayusculas = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es: " + fraseMayusculas);
    }
}
