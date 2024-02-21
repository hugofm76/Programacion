package Colecciones;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese N, K y X:");
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int X = scanner.nextInt();

        Queue<Integer> cola = new LinkedList<>();

        System.out.println("Ingrese los " + N + " números:");
        for (int i = 0; i < N; i++) {
            cola.offer(scanner.nextInt());
        }

        for (int i = 0; i < K; i++) {
            cola.poll();
        }

        if (cola.contains(X)) {
            System.out.println("true");
        } else {
            
            if (cola.isEmpty()) {
                System.out.println("0");
            } else {
               
                int min = Integer.MAX_VALUE;
                for (int num : cola) {
                    min = Math.min(min, num);
                }
                System.out.println(min);
            }
        }
    }
}

