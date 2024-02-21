package Arrays;

import java.util.Scanner;

public class Ejercicio12 {
    static Scanner scanner = new Scanner(System.in);
    static String[] alumnos;
    static double[][] calificaciones;
    static int numAlumnos;
    static int numEvaluaciones = 3;

    public static void main(String[] args) {
        System.out.print("Ingrese el número de alumnos: ");
        numAlumnos = scanner.nextInt();
        scanner.nextLine(); 

        alumnos = new String[numAlumnos];
        calificaciones = new double[numAlumnos][numEvaluaciones];

        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();

            for (int j = 0; j < numEvaluaciones; j++) {
                System.out.print("Ingrese la calificación de la evaluación " + (j + 1) + " para " + alumnos[i] + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); 
        }

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mostrarNotaMediaTodosAlumnos();
                    break;
                case 2:
                    mostrarNotaMediaAlumno();
                    break;
                case 3:
                    visualizarNotasPorEvaluacion();
                    break;
                case 4:
                    visualizarNotasPorEvaluacionAlumno();
                    break;
                case 5:
                    calcularNotaMediaCurso();
                    break;
                case 6:
                    calcularNotaExtremas();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar la nota media de todos los alumnos");
        System.out.println("2. Mostrar la nota media de un alumno determinado");
        System.out.println("3. Visualizar las notas por evaluación y la nota final de cada evaluación");
        System.out.println("4. Visualizar las notas por evaluación y la nota final de un alumno determinado");
        System.out.println("5. Calcular la nota media del curso");
        System.out.println("6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void mostrarNotaMediaTodosAlumnos() {
        double sumaTotal = 0;
        for (int i = 0; i < numAlumnos; i++) {
            double sumaAlumno = 0;
            for (int j = 0; j < numEvaluaciones; j++) {
                sumaAlumno += calificaciones[i][j];
            }
            double notaMediaAlumno = sumaAlumno / numEvaluaciones;
            System.out.println("Nota media de " + alumnos[i] + ": " + notaMediaAlumno);
            sumaTotal += notaMediaAlumno;
        }
        System.out.println("Nota media de todos los alumnos: " + (sumaTotal / numAlumnos));
    }

    public static void mostrarNotaMediaAlumno() {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        double sumaAlumno = 0;
        int indiceAlumno = -1;
        for (int i = 0; i < numAlumnos; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)) {
                indiceAlumno = i;
                break;
            }
        }
        if (indiceAlumno != -1) {
            for (int j = 0; j < numEvaluaciones; j++) {
                sumaAlumno += calificaciones[indiceAlumno][j];
            }
            double notaMediaAlumno = sumaAlumno / numEvaluaciones;
            System.out.println("Nota media de " + nombre + ": " + notaMediaAlumno);
        } else {
            System.out.println("No se encontró el alumno.");
        }
    }

    public static void visualizarNotasPorEvaluacion() {
        for (int j = 0; j < numEvaluaciones; j++) {
            System.out.println("\nEvaluación " + (j + 1) + ":");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println(alumnos[i] + ": " + calificaciones[i][j]);
            }
        }
    }

    public static void visualizarNotasPorEvaluacionAlumno() {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();
        int indiceAlumno = -1;
        for (int i = 0; i < numAlumnos; i++) {
            if (alumnos[i].equalsIgnoreCase(nombre)) {
                indiceAlumno = i;
                break;
            }
        }
        if (indiceAlumno != -1) {
            System.out.println("\nNotas de " + nombre + ":");
            for (int j = 0; j < numEvaluaciones; j++) {
                System.out.println("Evaluación " + (j + 1) + ": " + calificaciones[indiceAlumno][j]);
            }
        } else {
            System.out.println("No se encontró el alumno.");
        }
    }

    public static void calcularNotaMediaCurso() {
        double sumaTotal = 0;
        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numEvaluaciones; j++) {
                sumaTotal += calificaciones[i][j];
            }
        }
        double notaMediaCurso = sumaTotal / (numAlumnos * numEvaluaciones);
        System.out.println("Nota media del curso: " + notaMediaCurso);
    }

    public static void calcularNotaExtremas() {
        double notaMasAlta = Double.MIN_VALUE;
        double notaMasBaja = Double.MAX_VALUE;
        String alumnoNotaMasAlta = "";
        String alumnoNotaMasBaja = "";
        int evaluacionNotaMasAlta = -1;
        int evaluacionNotaMasBaja = -1;

        for (int i = 0; i < numAlumnos; i++) {
            for (int j = 0; j < numEvaluaciones; j++) {
                if (calificaciones[i][j] > notaMasAlta) {
                    notaMasAlta = calificaciones[i][j];
                    alumnoNotaMasAlta = alumnos[i];
                    evaluacionNotaMasAlta = j + 1;
                }
                if (calificaciones[i][j] < notaMasBaja) {
                    notaMasBaja = calificaciones[i][j];
                    alumnoNotaMasBaja = alumnos[i];
                    evaluacionNotaMasBaja = j + 1;
                }
            }
        }

        System.out.println("La nota más alta es " + notaMasAlta + " de " + alumnoNotaMasAlta + " en la evaluación " + evaluacionNotaMasAlta);
        System.out.println("La nota más baja es " + notaMasBaja + " de " + alumnoNotaMasBaja + " en la evaluación " + evaluacionNotaMasBaja);
    }
}

