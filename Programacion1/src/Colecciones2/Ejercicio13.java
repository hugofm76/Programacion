package Colecciones2;

import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio13 {
    public static void main(String[] args) {
        Deque<Integer> pila = new LinkedList<>();
        pila.push(2);
        pila.push(5);
        pila.push(8);
        pila.push(3);
        pila.push(7);

        System.out.println("Contenido inicial: " + pila);
        colapsar(pila);
        System.out.println("Contenido final: " + pila);
    }

    public static void colapsar(Deque<Integer> pila) {
       
        if (pila.isEmpty() || pila.size() == 1) {
            return;
        }

        Deque<Integer> aux = new LinkedList<>();
        
        while (!pila.isEmpty()) {
           
            if (pila.size() >= 2) {
                int num1 = pila.pop();
                int num2 = pila.pop();
                aux.push(num1 + num2);
            } else { 
                aux.push(pila.pop());
            }
        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
    }
}
