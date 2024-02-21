package ClasesObjetos;
import java.time.LocalDate;

public class Animal {
    private String nombre;
    private LocalDate fecha;

    public Animal(String nombre, LocalDate fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
        this.fecha = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Edad: " + calcularEdad();
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fecha.getYear();
        
        if (fechaActual.getMonthValue() < fecha.getMonthValue()
                || (fechaActual.getMonthValue() == fecha.getMonthValue()
                && fechaActual.getDayOfMonth() < fecha.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }

    public static void main(String[] args) {
        
        Animal animal1 = new Animal("Perro", LocalDate.of(2018, 5, 15));
        Animal animal2 = new Animal("Gato");
        
        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);

        animal2.setNombre("Hamster");
        System.out.println("Animal 2 (nombre modificado): " + animal2);
    }
}
