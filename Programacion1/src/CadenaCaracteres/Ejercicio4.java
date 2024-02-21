package CadenaCaracteres;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        construirPiramide(palabra);
    }

    public static void construirPiramide(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
           
            for (int j = 0; j <= i; j++) {
                System.out.print(palabra.charAt(j));
            }
            System.out.println(); 
        }
    }
}
