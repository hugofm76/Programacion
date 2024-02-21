package Arrays;

import java.util.Scanner;

public class Ejericicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[10];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        String cadenaMayorLongitud = obtenerCadenaMayorLongitud(nombres);

        System.out.println("La cadena de mayor longitud es: " + cadenaMayorLongitud);
    }

    public static String obtenerCadenaMayorLongitud(String[] vector) {
        if (vector == null || vector.length == 0) {
            return null; 
        }

        String mayorLongitud = vector[0]; 
        for (int i = 1; i < vector.length; i++) {
            
            if (vector[i].length() > mayorLongitud.length()) {
                mayorLongitud = vector[i];
            }
        }
        return mayorLongitud;
    }
}

