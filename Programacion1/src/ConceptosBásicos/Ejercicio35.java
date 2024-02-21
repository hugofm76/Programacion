package ConceptosBásicos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String contraseña = generarContraseñaAleatoria(random);

        boolean contraseñaAdivinada = false;
        int intentos = 0;

        System.out.println("¡Bienvenido al juego 'La Contraseña'!");

        while (!contraseñaAdivinada && intentos < 10) {
           
            System.out.print("Introduce una palabra (máximo 5 letras): ");
            String palabra = scanner.nextLine();

            if (palabra.equals(contraseña)) {
                contraseñaAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la contraseña '" + contraseña + "' en " + intentos + " intentos.");
            } else {
              
                mostrarLetrasCorrectas(contraseña, palabra);
                intentos++;
            }
        }

        if (!contraseñaAdivinada) {
            System.out.println("Lo siento, has alcanzado el número máximo de intentos. La contraseña era '" + contraseña + "'.");
        }
    }

    public static String generarContraseñaAleatoria(Random random) {
        int longitud = random.nextInt(6); // Longitud entre 0 y 5
        StringBuilder contraseña = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            char letra = (char) ('a' + random.nextInt(26)); // Generar letra aleatoria
            contraseña.append(letra);
        }
        return contraseña.toString();
    }

    public static void mostrarLetrasCorrectas(String contraseña, String palabra) {
        StringBuilder letrasAdivinadas = new StringBuilder();
        StringBuilder posicionesAdivinadas = new StringBuilder();

        int longitud = Math.min(contraseña.length(), palabra.length());
        for (int i = 0; i < longitud; i++) {
            if (contraseña.charAt(i) == palabra.charAt(i)) {
                letrasAdivinadas.append(palabra.charAt(i));
                posicionesAdivinadas.append(i + 1).append(" ");
            }
        }

        if (letrasAdivinadas.length() == 0) {
            System.out.println("No has acertado ninguna letra.");
        } else {
            System.out.println("Has acertado las letras '" + letrasAdivinadas.toString() +
                    "' en las posiciones " + posicionesAdivinadas.toString());
        }
    }
}
