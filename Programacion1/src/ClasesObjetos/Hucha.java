package ClasesObjetos;

import java.util.HashMap;
import java.util.Map;

public class Hucha {
	
    private Map<String, Integer> almacen;
    private boolean cerrada;
    private String contrasena;

    public Hucha() {
        this.almacen = new HashMap<>();
        inicializarAlmacen();
        this.cerrada = true;
        this.contrasena = "1234"; 
    }

    public Hucha(Map<String, Integer> almacenInicial) {
        this();
        for (String tipo : almacenInicial.keySet()) {
            int cantidad = almacenInicial.get(tipo);
            if (cantidad >= 0) {
                almacen.put(tipo, cantidad);
            }
        }
    }

    public Hucha(double cantidadInicial) {
        this();
        desglosarCantidad(cantidadInicial);
    }

    private void inicializarAlmacen() {
        almacen.put("1 euro", 0);
        almacen.put("2 euros", 0);
        almacen.put("5 euros", 0);
        almacen.put("10 euros", 0);
        almacen.put("20 euros", 0);
        almacen.put("50 euros", 0);
    }

    private void desglosarCantidad(double cantidad) {
        int[] valores = {50, 20, 10, 5, 2, 1};
        for (int valor : valores) {
            int cantidadActual = (int) (cantidad / valor);
            almacen.put(valor + " euros", cantidadActual);
            cantidad -= cantidadActual * valor;
        }
    }

    public void abrir(String contrasena) {
        if (this.contrasena.equals(contrasena)) {
            cerrada = false;
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }

    public void cerrar() {
        cerrada = true;
    }

    public void cambiarContrasena(String nuevaContrasena) {
        contrasena = nuevaContrasena;
    }

    public double obtenerValorTotal() {
        double valorTotal = 0;
        for (String tipo : almacen.keySet()) {
            int cantidad = almacen.get(tipo);
            int valor = Integer.parseInt(tipo.split(" ")[0]);
            valorTotal += cantidad * valor;
        }
        return valorTotal;
    }

    public void retirarCantidad(double cantidad) {
        Map<String, Integer> retiro = new HashMap<>();
        double cantidadRestante = cantidad;
        int[] valores = {50, 20, 10, 5, 2, 1};
        for (int valor : valores) {
            String tipo = valor + " euros";
            int cantidadDisponible = almacen.get(tipo);
            int cantidadARetirar = Math.min(cantidadDisponible, (int) (cantidadRestante / valor));
            retiro.put(tipo, cantidadARetirar);
            cantidadRestante -= cantidadARetirar * valor;
        }

        for (String tipo : retiro.keySet()) {
            int cantidadRetirada = retiro.get(tipo);
            almacen.put(tipo, almacen.get(tipo) - cantidadRetirada);
        }
    }

    public void mostrarContenido() {
        for (String tipo : almacen.keySet()) {
            int cantidad = almacen.get(tipo);
            System.out.println(tipo + ": " + cantidad);
        }
    }

    public static void main(String[] args) {
    
        Hucha hucha1 = new Hucha();
        Hucha hucha2 = new Hucha(100);
        Map<String, Integer> almacenInicial = new HashMap<>();
        almacenInicial.put("2 euros", 5);
        almacenInicial.put("5 euros", 3);
        almacenInicial.put("50 euros", 2);
        Hucha hucha3 = new Hucha(almacenInicial);

        System.out.println("Hucha 1 (vacía):");
        hucha1.mostrarContenido();
        System.out.println("Valor total en euros: " + hucha1.obtenerValorTotal());

        System.out.println("\nHucha 2 (100 euros):");
        hucha2.mostrarContenido();
        System.out.println("Valor total en euros: " + hucha2.obtenerValorTotal());

        System.out.println("\nHucha 3 (5 monedas de 2 euros, 3 billetes de 5 euros, 2 billetes de 50 euros):");
        hucha3.mostrarContenido();
        System.out.println("Valor total en euros: " + hucha3.obtenerValorTotal());
    }
}

