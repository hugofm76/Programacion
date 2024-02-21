package unidad7Empresa;

import java.util.ArrayList;
import java.util.List;

public class Contratista extends Empleado implements ServicioContratable {
    private List<String> sociedadesAnonimas;

    public Contratista(String nombre, String apellidos, String fechaContratacion, String numeroCuenta) {
        super(nombre, apellidos, fechaContratacion, numeroCuenta);
        this.sociedadesAnonimas = new ArrayList<>();
    }

    public List<String> getSociedadesAnonimas() {
        return sociedadesAnonimas;
    }

    public void setSociedadesAnonimas(List<String> sociedadesAnonimas) {
        this.sociedadesAnonimas = sociedadesAnonimas;
    }

    public void agregarSociedadAnonima(String nombreSociedad) {
        sociedadesAnonimas.add(nombreSociedad);
    }

    @Override
    public void realizarPago(double cantidad) {
        System.out.println("Se ha realizado el pago al contratista " + getNombre() + " " + getApellidos() +
                " por un importe de " + cantidad);
    }
}

