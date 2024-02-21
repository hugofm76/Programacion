package Colecciones2;

import java.util.Stack;

public class Ejercicio12 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(5);
        pila.push(9);
        pila.push(2);
        pila.push(6);
        pila.push(7);

        System.out.println("Pila original: " + pila);
        duplicar(pila);
        System.out.println("Pila duplicada: " + pila);
    }

    public static void duplicar(Stack<Integer> pila) {
        Stack<Integer> aux = new Stack<>();

        while (!pila.isEmpty()) {
            int num = pila.pop();
            aux.push(num);
            aux.push(num); 
        }
        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
    }
}

