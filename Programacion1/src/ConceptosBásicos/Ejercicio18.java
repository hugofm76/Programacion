package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        int sumaEdades = 0;
        int cantidadAlumnos = 0;
        int cantidadMayores18 = 0;

        System.out.println("Introduce las edades de los alumnos (introduce un número negativo para salir): ");

        
        do {
            System.out.print("Edad del alumno: ");
            edad = scanner.nextInt();

            
            if (edad >= 0) {
                sumaEdades += edad;
                cantidadAlumnos++;

                if (edad > 18) {
                    cantidadMayores18++;
                }
            }
        } while (edad >= 0);

        
        if (cantidadAlumnos > 0) {
            double media = (double) sumaEdades / cantidadAlumnos;
            System.out.println("La media de las edades es: " + media);
            System.out.println("La suma total de las edades es: " + sumaEdades);
            System.out.println("El número de alumnos con más de 18 años es: " + cantidadMayores18);
        } else {
            System.out.println("No se introdujo ninguna edad válida.");
        }
    }
}
