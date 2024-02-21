package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio14 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el número del DNI (sin letra): ");
	        int numeroDNI = scanner.nextInt();

	        char letraDNI = calcularLetraDNI(numeroDNI);

	        System.out.println("La letra del DNI es: " + letraDNI);
	    }

	    public static char calcularLetraDNI(int numeroDNI) {
	        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

	        int resto = numeroDNI % 23;
	        return letrasDNI[resto];
	    }
	}


