package ClasesObjetos;

import java.util.Scanner;

public class Automovil {
    private String modelo;
    private double capacidadDeposito;
    private double cantidadCombustible;
    private double consumoPorKilometro;
    private double kilometrosRecorridos;
    private double combustibleConsumido;

    public Automovil(String modelo, double capacidadDeposito, double litrosEnDeposito, double consumo) {
        this.modelo = modelo;
        this.capacidadDeposito = capacidadDeposito;
        this.cantidadCombustible = litrosEnDeposito;
        this.consumoPorKilometro = consumo;
    }

    public Automovil(String modelo, double capacidadDeposito, double consumo) {
        this.modelo = modelo;
        this.capacidadDeposito = capacidadDeposito;
        this.cantidadCombustible = capacidadDeposito;
        this.consumoPorKilometro = consumo;
    }

    public double llenarDeposito() {
        double cantidadAgregada = capacidadDeposito - cantidadCombustible;
        cantidadCombustible = capacidadDeposito;
        return cantidadAgregada;
    }

    public double llenarDeposito(double cantidad) {
        if (cantidad + cantidadCombustible <= capacidadDeposito) {
            cantidadCombustible += cantidad;
            return 0;
        } else {
            double sobrante = (cantidad + cantidadCombustible) - capacidadDeposito;
            cantidadCombustible = capacidadDeposito;
            return sobrante;
        }
    }

    public void desplazar(double kilometros) {
        double combustibleNecesario = consumoPorKilometro * kilometros;
        if (combustibleNecesario <= cantidadCombustible) {
            cantidadCombustible -= combustibleNecesario;
            kilometrosRecorridos += kilometros;
            combustibleConsumido += combustibleNecesario;
            System.out.printf("%s %.2f %.2f\n", modelo, cantidadCombustible, combustibleConsumido);
        } else {
            System.out.println("Combustible insuficiente para este desplazamiento");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public double getCombustibleConsumido() {
        return combustibleConsumido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Automovil[] autos = new Automovil[n];
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < n; i++) {
            String[] datosAuto = scanner.nextLine().split(" ");
            autos[i] = new Automovil(datosAuto[0], Double.parseDouble(datosAuto[1]), Double.parseDouble(datosAuto[2]), Double.parseDouble(datosAuto[3]));
        }

        String input = scanner.nextLine();
        while (!input.equals("fin")) {
            String[] datosDesplazamiento = input.split(" ");
            for (Automovil auto : autos) {
                if (auto.getModelo().equals(datosDesplazamiento[1])) {
                    auto.desplazar(Double.parseDouble(datosDesplazamiento[2]));
                    break;
                }
            }
            input = scanner.nextLine();
        }

        for (Automovil auto : autos) {
            System.out.printf("%s %.2f %.0f %.2f\n", auto.getModelo(), auto.getCantidadCombustible(), auto.getKilometrosRecorridos(), auto.getCombustibleConsumido());
        }

        scanner.close();
    }
}
