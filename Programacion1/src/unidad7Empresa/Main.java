package unidad7Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        List<ServicioContratable> contratados = new ArrayList<>();

        Asalariado asalariado = new Asalariado("Juan", "García", "01-01-2023", "123456", 2000.0);
        Contratista contratista = new Contratista("María", "López", "01-01-2022", "654321");
        contratista.agregarSociedadAnonima("Empresa XYZ");
       
        
        contratados.add(asalariado);
        contratados.add(contratista);
       
        for (ServicioContratable servicio : contratados) {
            servicio.realizarPago(1000.0); 
        }

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(asalariado);
        empleados.add(contratista);
    }
}


