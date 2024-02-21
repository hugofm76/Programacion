package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la coordenada x: ");
        double x = scanner.nextDouble();
        System.out.print("Introduce la coordenada y: ");
        double y = scanner.nextDouble();

        double[] coordenadasPolares = calcularCoordenadasPolares(x, y);

        double r = coordenadasPolares[0];
        double theta = coordenadasPolares[1];
        System.out.println("Las coordenadas polares son (r, theta): (" + r + ", " + theta + ")");
    }

    public static double[] calcularCoordenadasPolares(double x, double y) {
        double r = Math.sqrt(x * x + y * y); 
        double theta = Math.atan2(y, x); 

        return new double[]{r, theta};
    }
}
