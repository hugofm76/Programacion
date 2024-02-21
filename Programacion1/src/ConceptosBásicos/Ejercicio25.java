package ConceptosBásicos;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número entero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        
        invertirArray(numeros);

        System.out.println("El array invertido es:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void invertirArray(int[] array) {
        int longitud = array.length;
        for (int i = 0; i < longitud / 2; i++) {
          
            int temp = array[i];
            array[i] = array[longitud - 1 - i];
            array[longitud - 1 - i] = temp;
        }
    }
}

