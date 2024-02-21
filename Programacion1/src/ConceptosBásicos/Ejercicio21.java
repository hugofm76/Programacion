package ConceptosBásicos;

public class Ejercicio21 {
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + calcularFibonacci(n));
    }
}
