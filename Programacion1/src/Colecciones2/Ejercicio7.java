package Colecciones2;

import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        numeros.addAll(Arrays.asList(6, 22, 17, 17, 10, 7, 9, 14, 5, 12, 7, 2));
        eliminarSiMayoresEncima(numeros);
        System.out.println("Pila después de eliminar elementos con números mayores encima: " + numeros);
    }

    public static void eliminarSiMayoresEncima(Stack<Integer> pila) {
        Stack<Integer> auxiliar = new Stack<>();

        while (!pila.isEmpty()) {
            int elementoActual = pila.pop();
            boolean eliminar = false;

            while (!auxiliar.isEmpty() && auxiliar.peek() < elementoActual) {
                auxiliar.pop();
                eliminar = true;
            }

            if (!eliminar) {
                auxiliar.push(elementoActual);
            }
        }

        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }
    }
}
