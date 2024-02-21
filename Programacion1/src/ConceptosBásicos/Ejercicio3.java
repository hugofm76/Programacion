package ConceptosBásicos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Pon los euros que quieras convertir a dólares : ");
		Double euros = Double.parseDouble(in.readLine());
		Double convertidor = euros * 1.08; 
		
		
		System.out.println("Dólares: " + convertidor);

	}

}
