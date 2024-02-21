package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escriba un numero");
		int numero = scanner.nextInt();
		
		if (numero > 0) {
			System.out.println("El número es positivo");
		} else if (numero == 0){
			System.out.println("El número es 0");
		} else {
			System.out.println("El número es negativo");
		}

	}

}
