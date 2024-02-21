package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int masa1, masa2, distancia;
		double g = 6673e-11;
		
		System.out.println("Introduce masa 1");
		masa1 = scanner.nextInt();
		
		System.out.println("Introduce masa 2");
		masa2 = scanner.nextInt();
		
		System.out.println("Introduce la distancia que hay entre las masas");
		distancia = scanner.nextInt();
		
		double gravitacion = g * ((masa1 * masa2)/(distancia * distancia));
		System.out.println("La gravticacion que hay entre los objetos es: " + gravitacion);
		
		

	}

}
