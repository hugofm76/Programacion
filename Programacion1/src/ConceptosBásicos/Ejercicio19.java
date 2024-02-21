package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            
            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma += i;
            }

            System.out.println("La suma de todos los enteros desde 1 hasta " + numero + " es: " + suma);
        }
    }
}

