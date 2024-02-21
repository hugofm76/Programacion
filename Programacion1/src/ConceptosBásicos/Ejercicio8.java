package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Introduce el valor de la componente roja (0-255): ");
	        int r = scanner.nextInt();
	        System.out.print("Introduce el valor de la componente verde (0-255): ");
	        int g = scanner.nextInt();
	        System.out.print("Introduce el valor de la componente azul (0-255): ");
	        int b = scanner.nextInt();

	        
	        if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {
	            // Convertir de RGB a YIQ
	            double y = 0.299 * r + 0.587 * g + 0.114 * b;
	            double i = 0.596 * r - 0.275 * g - 0.321 * b;
	            double q = 0.212 * r - 0.528 * g + 0.311 * b;

	          
	            System.out.println("\nComponentes en el espacio YIQ:");
	            System.out.println("Y: " + y);
	            System.out.println("I: " + i);
	            System.out.println("Q: " + q);
	        } else {
	            System.out.println("Los valores de las componentes RGB deben estar en el rango de 0 a 255.");
	        }
	    }
	}



