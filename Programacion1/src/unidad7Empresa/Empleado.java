package unidad7Empresa;

public class Empleado implements ServicioContratable {
    private String nombre;
    private String apellidos;
    private String fechaContratacion;
    private String numeroCuenta;

    public Empleado(String nombre, String apellidos, String fechaContratacion, String numeroCuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
        this.numeroCuenta = numeroCuenta;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // 
    public void realizarPago(double cantidad) {
        System.out.println("Se ha realizado un pago a la cuenta " + numeroCuenta + " por un importe de " + cantidad);
    }
}

