package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
    	
    	System.out.println("La palabra se cambia en el mismo codigo del programa");
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "apruebo";
        int intentosMaximos = 7;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        int intentos = 0;
        boolean juegoTerminado = false;

        System.out.println("¡Bienvenido al juego del Ahorcado!");

        while (!juegoTerminado) {
            
            System.out.print("Palabra: ");
            for (char letra : letrasAdivinadas) {
                System.out.print(letra + " ");
            }
            System.out.println();

            System.out.print("Introduce una letra: ");
            char letra = scanner.nextLine().charAt(0);

            boolean letraAdivinada = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada) {
                intentos++;
                System.out.println("La letra '" + letra + "' no está en la palabra. Intentos restantes: " + (intentosMaximos - intentos));
            }

            if (intentos >= intentosMaximos) {
                System.out.println("¡Lo siento! Has agotado todos tus intentos. La palabra era: " + palabraSecreta);
                juegoTerminado = true;
            } else if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                juegoTerminado = true;
            }
        }
    }
}

