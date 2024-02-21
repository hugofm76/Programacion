package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio12 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el valor de N: ");
	        int N = scanner.nextInt();
	        
	        double suma = 0.0;
	        
	        for (int i = 1; i <= N; i++) {
	            suma += 1.0 / i;
	        }

	        System.out.println("La suma de la serie es: " + suma);
	    }
	}



