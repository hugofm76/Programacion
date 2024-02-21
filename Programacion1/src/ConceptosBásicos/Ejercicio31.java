package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();

        buscarVocales(texto);
    }

    public static void buscarVocales(String texto) {
        System.out.println("Las vocales se encuentran en las siguientes posiciones:");
        for (int i = 0; i < texto.length(); i++) {
            char caracter = Character.toLowerCase(texto.charAt(i)); 
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println(caracter + " - Posición: " + (i + 1));
            }
        }
    }
}
