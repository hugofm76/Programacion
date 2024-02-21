package Arrays;

import java.util.Arrays;

public class Ejercicio5 {

    public static int maximo(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede ser nulo o vacío");
        }
        int max = vector[0];
        for (int num : vector) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double media(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede ser nulo o vacío");
        }
        double suma = 0;
        for (int num : vector) {
            suma += num;
        }
        return suma / vector.length;
    }

    public static int contarCadenas(String[] vector, String cadena) {
        int count = 0;
        for (String str : vector) {
            if (str.equals(cadena)) {
                count++;
            }
        }
        return count;
    }

    public static boolean sonIguales(String[] vector1, String[] vector2) {
        return Arrays.equals(vector1, vector2);
    }

    public static void intercambiar(String[] vector) {
        for (int i = 0; i < vector.length - 1; i += 2) {
            String temp = vector[i];
            vector[i] = vector[i + 1];
            vector[i + 1] = temp;
        }
    }

    public static int rango(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede ser nulo o vacío");
        }
        int max = maximo(vector);
        int min = vector[0];
        for (int num : vector) {
            if (num < min) {
                min = num;
            }
        }
        return max - min + 1;
    }

    public static double desviacionEstandar(int[] vector) {
        if (vector == null || vector.length == 0) {
            throw new IllegalArgumentException("El vector no puede ser nulo o vacío");
        }
        double media = media(vector);
        double sumaCuadrados = 0;
        for (int num : vector) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        double varianza = sumaCuadrados / vector.length;
        return Math.sqrt(varianza);
    }

    public static int minimaDiferencia(int[] vector) {
        if (vector == null || vector.length < 2) {
            throw new IllegalArgumentException("El vector debe tener al menos dos elementos");
        }
        int minDif = Math.abs(vector[1] - vector[0]);
        for (int i = 2; i < vector.length; i++) {
            int dif = Math.abs(vector[i] - vector[i - 1]);
            if (dif < minDif) {
                minDif = dif;
            }
        }
        return minDif;
    }

    public static int[] sumarPares(int[] vector) {
        int[] resultado = new int[(vector.length + 1) / 2];
        for (int i = 0; i < vector.length - 1; i += 2) {
            resultado[i / 2] = vector[i] + vector[i + 1];
        }
        if (vector.length % 2 != 0) {
            resultado[resultado.length - 1] = vector[vector.length - 1];
        }
        return resultado;
    }

    public static int[] concatenar(int[] vector1, int[] vector2) {
        int[] resultado = new int[vector1.length + vector2.length];
        System.arraycopy(vector1, 0, resultado, 0, vector1.length);
        System.arraycopy(vector2, 0, resultado, vector1.length, vector2.length);
        return resultado;
    }

    public static int longitudSubsecuencia(int[] vector) {
        int maxLongitud = 0;
        int longitudActual = 1;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] >= vector[i - 1]) {
                longitudActual++;
            } else {
                maxLongitud = Math.max(maxLongitud, longitudActual);
                longitudActual = 1;
            }
        }
        return Math.max(maxLongitud, longitudActual);
    }

    public static void main(String[] args) {
        
        int[] numeros = {5, 9, 11, 2, 7, 17, -9, 0, 13, 209, 75, 99, 21};
        String[] cadenas1 = {"Hola", "Mundo", "Java", "Programación"};
        String[] cadenas2 = {"Hola", "Mundo", "Java", "Programación"};
        String[] cadenas3 = {"Hola", "Mundo", "Java"};
        int[] numeros1 = {3, 6, 9, 2, 8, 13, 12, 0};
        int[] numeros2 = {5, 4, 9, 3, 7, 12, 8, 11};

        System.out.println("Máximo valor: " + maximo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Cantidad de cadenas 'Java': " + contarCadenas(cadenas1, "Java"));
        System.out.println("¿Son iguales los vectores cadenas1 y cadenas2? " + sonIguales(cadenas1, cadenas2));
        intercambiar(cadenas3);
        System.out.println("Cadenas intercambiadas: " + Arrays.toString(cadenas3));
        System.out.println("Rango: " + rango(numeros));
        System.out.println("Desviación estándar: " + desviacionEstandar(numeros1));
        System.out.println("Mínima diferencia: " + minimaDiferencia(numeros2));
        System.out.println("Suma de pares: " + Arrays.toString(sumarPares(numeros2)));
        System.out.println("Concatenación de vectores: " + Arrays.toString(concatenar(numeros1, numeros2)));
        System.out.println("Longitud de la subsecuencia más larga: " + longitudSubsecuencia(numeros));
    }
}
