package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        long inicio = System.currentTimeMillis();

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();

        
        long fin = System.currentTimeMillis();

        
        long tiempoTotal = fin - inicio;

        
        double segundos = tiempoTotal / 1000.0;
        double milisegundos = tiempoTotal % 1000;

        
        System.out.printf("Hola, %s. Has tardado %.3f segundos en responder. (%.3f milisegundos)%n", nombre, segundos, milisegundos);
    }
}

