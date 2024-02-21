package CadenaCaracteres;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        int conteo = contarSubcadenas(cadena1, cadena2);

        System.out.println("La segunda cadena está contenida en la primera " + conteo + " veces.");
    }

    public static int contarSubcadenas(String cadena1, String cadena2) {
        int conteo = 0;
        int indice = cadena1.indexOf(cadena2);
        while (indice != -1) {
            conteo++;
           
            indice = cadena1.indexOf(cadena2, indice + 1);
        }

        return conteo;
    }
}
