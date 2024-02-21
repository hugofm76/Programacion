package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione un numero");
		
		int numero = scanner.nextInt();
		double i = Math.floor(Math.random()* 100);
		
	
		while (numero > i || numero < i) {
		if ( numero > i) {
			System.out.println("El numero es menor" + " " );
			numero = scanner.nextInt();
		} else if (numero < i) {
			System.out.println("El numero es mayor" + " ");
			numero = scanner.nextInt();
		}
		if (numero == i) {
			System.out.printf("Has acertado el numero" + " " + i);
			
		}
		}
	}

}
