package CadenaCaracteres;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaValoresNumericos = 0;

        System.out.println("Introduce secuencias de caracteres con el formato LetraNúmeroCarácter.");
        System.out.println("El programa finalizará cuando se detecte un EOF.");

        while (scanner.hasNext()) {
            String secuencia = scanner.next();
            double valorNumerico = calcularValorNumerico(secuencia);
            sumaValoresNumericos += valorNumerico;
        }

        System.out.println("La suma de los valores numéricos obtenidos es: " + sumaValoresNumericos);
    }

    public static double calcularValorNumerico(String secuencia) {
        char primeraLetra = secuencia.charAt(0);
        char ultimoCaracter = secuencia.charAt(secuencia.length() - 1);
        double numero = Double.parseDouble(secuencia.substring(1, secuencia.length() - 1));

        double resultado;

        if (Character.isUpperCase(primeraLetra)) {
            int valorLetra = primeraLetra - 'A' + 1;
            resultado = numero * valorLetra;
        } else {
            
            int valorLetra = primeraLetra - 'a' + 1;
            resultado = numero / valorLetra;
        }

        if (Character.isLetter(ultimoCaracter)) {
            resultado = Math.sqrt(resultado);
        } else if (Character.isDigit(ultimoCaracter)) {
            resultado = Math.log(resultado);
        } else {
            resultado = Math.exp(resultado);
        }

        return resultado;
    }
}

