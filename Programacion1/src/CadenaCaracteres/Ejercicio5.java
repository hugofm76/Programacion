package CadenaCaracteres;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nombres. Escribe 'fin' para terminar.");

        while (true) {
            String nombre = scanner.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            String nombreSustituido = sustituirCaracteresCentrales(nombre);
            System.out.println(nombreSustituido);
        }
    }

    public static String sustituirCaracteresCentrales(String nombre) {
       
        if (nombre.length() <= 2) {
            return nombre;
        }

        int inicio = nombre.length() / 2 - 1;
        int fin = nombre.length() % 2 == 0 ? inicio + 1 : inicio;

        String caracteresCentrales = nombre.substring(inicio, fin + 1);
        String asteriscos = "*".repeat(caracteresCentrales.length());

        String nombreSustituido = nombre.substring(0, inicio) + asteriscos + nombre.substring(fin + 1);

        return nombreSustituido;
    }
}

