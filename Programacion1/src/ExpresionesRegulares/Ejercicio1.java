package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca una línea con nombres separados por comas
        System.out.println("Introduce una línea con nombres separados por comas:");
        String linea = scanner.nextLine();

        // Definir la expresión regular para encontrar nombres
        String regex = "\\b[A-Z][a-z]{1,}[ ](?:[A-Z][a-z]{1,}[ ]?)+\\b";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(regex);

        // Encontrar nombres en la línea introducida por el usuario
        Matcher matcher = pattern.matcher(linea);

        // Mostrar los nombres encontrados, cada uno en una línea
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

