package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        int cantidadEspacios = contarEspacios(frase);

        System.out.println("La frase tiene " + cantidadEspacios + " espacios en blanco.");
    }

    public static int contarEspacios(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }
}
