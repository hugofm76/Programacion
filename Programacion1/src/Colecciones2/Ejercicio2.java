package Colecciones2;

import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
        Set<Integer> numeros1 = Set.of(2, 4, 6, 8, 10);
        Set<Integer> numeros2 = Set.of(2, 4, 6, 7, 10);

        System.out.println("El conjunto numeros1 contiene impares: " + contieneImpares(numeros1));
        System.out.println("El conjunto numeros2 contiene impares: " + contieneImpares(numeros2));
    }

    public static boolean contieneImpares(Set<Integer> conjunto) {
        for (int num : conjunto) {
            if (num % 2 != 0) {
                return true; 
            }
        }
        return false; 
    }
}
