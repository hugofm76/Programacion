package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ocurrencias = new int[26]; 

        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) { 
                int indice = caracter - 'a'; 
                ocurrencias[indice]++; 
            }
        }

        System.out.println("Ocurrencias de cada letra del abecedario:");
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i); 
            if (ocurrencias[i] > 0) {
                System.out.println(letra + ": " + ocurrencias[i]);
            }
        }
    }
}
