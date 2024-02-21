package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio10 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Introduce las constantes de la ecuación de segundo grado ax^2 + bx + c = 0:");
	        System.out.print("a: ");
	        double a = scanner.nextDouble();
	        System.out.print("b: ");
	        double b = scanner.nextDouble();
	        System.out.print("c: ");
	        double c = scanner.nextDouble();

	        
	        double discriminante = b * b - 4 * a * c;

	     
	        if (discriminante > 0) {
	            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
	            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
	            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
	        } else if (discriminante == 0) {
	            double x = -b / (2 * a);
	            System.out.println("La solución doble es x = " + x);
	        } else {
	            System.out.println("La ecuación no tiene soluciones reales.");
	        }
	    }
	}



