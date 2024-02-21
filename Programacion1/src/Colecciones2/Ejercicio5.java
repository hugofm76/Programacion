package Colecciones2;

import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(-3);
        pila.push(8);
        pila.push(-2);
        pila.push(7);

        System.out.println("Pila original:");
        System.out.println(pila);

        negativosAbajoPositivosArriba(pila);

        System.out.println("Pila reorganizada:");
        System.out.println(pila);
    }

    public static void negativosAbajoPositivosArriba(Stack<Integer> pila) {
        Queue<Integer> cola = new LinkedList<>();

        while (!pila.isEmpty()) {
            int num = pila.pop();
            if (num >= 0) {
                cola.offer(num);
            } else {
                pila.push(num);
            }
        }

        while (!pila.isEmpty()) {
            cola.offer(pila.pop());
        }

        while (!cola.isEmpty()) {
            pila.push(cola.poll());
        }
    }
}

