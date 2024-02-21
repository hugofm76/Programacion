package unidad7Empresa;

public class Asalariado extends Empleado implements ServicioContratable {
    private double salarioMensual;

    public Asalariado(String nombre, String apellidos, String fechaContratacion, String numeroCuenta, double salarioMensual) {
        super(nombre, apellidos, fechaContratacion, numeroCuenta);
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.println("Se ha realizado el pago al asalariado " + getNombre() + " " + getApellidos() +
                " por un importe de " + cantidad);
    }
}

