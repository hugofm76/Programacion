package ConceptosBásicos;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un radio");
		
		int radio = scanner.nextInt();
		
		double perimetro = (2 * radio * Math.PI); 
		double area = 	(radio * radio) * Math.PI;	
		
		System.out.println("Perímetro: " + perimetro);
		System.out.println("Area: " + area);

	}


	}


