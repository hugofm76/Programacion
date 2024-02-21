package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] coeficientes = {
            {0.90, 0.10, 3}, 
            {0.80, 0.20, 2}, 
            {0.85, 0.15, 3}};

        double totalMatematicas = calcularNotaTotal(coeficientes[0]);
        double totalFisica = calcularNotaTotal(coeficientes[1]);
        double totalQuimica = calcularNotaTotal(coeficientes[2]);
        double totalCreditos = 3.0;

        double notaMediaMatematicas = totalMatematicas / totalCreditos;
        double notaMediaFisica = totalFisica / totalCreditos;
        double notaMediaQuimica = totalQuimica / totalCreditos;
        double notaMediaGlobal = (notaMediaMatematicas + notaMediaFisica + notaMediaQuimica) / 3;

        System.out.printf("Nota media en Matemáticas: %.2f\n", notaMediaMatematicas);
        System.out.printf("Nota media en Física: %.2f\n", notaMediaFisica);
        System.out.printf("Nota media en Química: %.2f\n", notaMediaQuimica);
        System.out.printf("Nota media global: %.2f\n", notaMediaGlobal);
    }

    public static double calcularNotaTotal(double[] coeficientes) {
        Scanner scanner = new Scanner(System.in);
        
        double a = coeficientes[0]; 
        double b = coeficientes[1]; 
        double c = coeficientes[2];
   
        System.out.print("Introduce la nota del examen: ");
        double notaExamen = scanner.nextDouble();

        double notaTareas = 0;
        for (int j = 1; j <= c; j++) {
            System.out.print("Introduce la nota de la tarea " + j + ": ");
            notaTareas += scanner.nextDouble();
        }
        notaTareas /= c;

        return a * notaExamen + b * notaTareas;
    }
}

