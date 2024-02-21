package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese la cantidad de números a sumar: ");
	        int n = scanner.nextInt();

	        double suma = 0.0;
	        double numero;

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Ingrese el número " + i + ": ");
	            numero = scanner.nextDouble();
	            suma += numero;
	        }

	       
	        double media = suma / n;

	        System.out.println("La suma de los números ingresados es: " + suma);
	        System.out.println("La media de los números ingresados es: " + media);
	    }
	}



