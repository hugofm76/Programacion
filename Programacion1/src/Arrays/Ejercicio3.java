package Arrays;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector (entre 10 y 1,000,000): ");
        int tamañoVector = scanner.nextInt();
        scanner.nextLine(); 

        if (tamañoVector < 10 || tamañoVector > 1000000) {
            System.out.println("Tamaño de vector no válido.");
            return;
        }

        int[] vector = new int[tamañoVector];

        long inicioLlenado = System.currentTimeMillis(); 
        Set<Integer> numerosUsados = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < tamañoVector; i++) {
            int numeroAleatorio;
            do {
                numeroAleatorio = rand.nextInt(2000000) - 999999; 
            } while (numerosUsados.contains(numeroAleatorio));
            vector[i] = numeroAleatorio;
            numerosUsados.add(numeroAleatorio);
        }
        long finLlenado = System.currentTimeMillis(); 
        System.out.println("Tamaño del vector: " + tamañoVector);

        long tiempoLlenado = finLlenado - inicioLlenado;
        System.out.println("Tiempo empleado en llenar el vector: " + tiempoLlenado + " milisegundos");

        long inicioCalculo = System.currentTimeMillis(); 
        int menor = Integer.MAX_VALUE;
        int mayor = Integer.MIN_VALUE;
        for (int num : vector) {
            menor = Math.min(menor, num);
            mayor = Math.max(mayor, num);
        }
        long finCalculo = System.currentTimeMillis(); 

        System.out.println("Diferencia entre el menor y el mayor número: " + (mayor - menor));
        long tiempoCalculo = finCalculo - inicioCalculo;
        System.out.println("Tiempo empleado en calcular la diferencia: " + tiempoCalculo + " milisegundos");
    }
}
