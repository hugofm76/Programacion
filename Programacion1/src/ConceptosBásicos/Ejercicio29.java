package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_ASIGNATURAS = 3;
        final int NUMERO_ALUMNOS = 10;

        double[][] calificaciones = new double[NUMERO_ALUMNOS][NUMERO_ASIGNATURAS];

        for (int i = 0; i < NUMERO_ALUMNOS; i++) {
            System.out.println("Ingrese las calificaciones para el alumno " + (i + 1) + ":");
            for (int j = 0; j < NUMERO_ASIGNATURAS; j++) {
                System.out.print("Calificación en la asignatura " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }

        double[] mediasAsignaturas = new double[NUMERO_ASIGNATURAS];
        for (int j = 0; j < NUMERO_ASIGNATURAS; j++) {
            double suma = 0;
            for (int i = 0; i < NUMERO_ALUMNOS; i++) {
                suma += calificaciones[i][j];
            }
            mediasAsignaturas[j] = suma / NUMERO_ALUMNOS;
        }

        System.out.println("\nMedia de calificaciones en cada asignatura:");
        for (int j = 0; j < NUMERO_ASIGNATURAS; j++) {
            System.out.println("Asignatura " + (j + 1) + ": " + mediasAsignaturas[j]);
        }
    }
}
