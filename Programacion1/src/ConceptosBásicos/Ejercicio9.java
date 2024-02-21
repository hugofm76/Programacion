package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio9 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        double[] examen = new double[3];
	        double[] tareas = new double[3];
	        int[] numTareasRealizadas = new int[3];

	 
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Materia " + (i + 1));
	            System.out.print("Nota del examen (0-10): ");
	            examen[i] = scanner.nextDouble();
	            System.out.print("Nota de las tareas (0-10): ");
	            tareas[i] = scanner.nextDouble();
	            System.out.print("Número de tareas realizadas: ");
	            numTareasRealizadas[i] = scanner.nextInt();
	        }

	        
	        double notaMediaMatematicas = calcularNotaMedia(examen[0], tareas[0], numTareasRealizadas[0], 0.90, 0.10);
	        double notaMediaFisica = calcularNotaMedia(examen[1], tareas[1], numTareasRealizadas[1], 0.80, 0.20);
	        double notaMediaQuimica = calcularNotaMedia(examen[2], tareas[2], numTareasRealizadas[2], 0.85, 0.15);
	        double notaMediaGlobal = (notaMediaMatematicas + notaMediaFisica + notaMediaQuimica) / 3.0;

	       
	        System.out.printf("Nota media en Matemáticas: %.2f\n", notaMediaMatematicas);
	        System.out.printf("Nota media en Física: %.2f\n", notaMediaFisica);
	        System.out.printf("Nota media en Química: %.2f\n", notaMediaQuimica);
	        System.out.printf("Nota media global: %.2f\n", notaMediaGlobal);
	    }

	    
	    public static double calcularNotaMedia(double notaExamen, double notaTareas, int numTareasRealizadas, double pesoExamen, double pesoTareas) {
	        double notaMedia = (notaExamen * pesoExamen) + (notaTareas * pesoTareas * numTareasRealizadas);
	        return notaMedia;
	    }
	}



