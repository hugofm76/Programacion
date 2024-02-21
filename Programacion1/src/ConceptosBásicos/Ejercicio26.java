package ConceptosBásicos;

public class Ejercicio26 {
    public static void main(String[] args) {
        
        int[] primos = new int[20];
        int contador = 0; 
        int numero = 2; 

        while (contador < 20) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.println("Los 20 primeros números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
