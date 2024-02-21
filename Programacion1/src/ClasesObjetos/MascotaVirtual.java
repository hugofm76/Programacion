package ClasesObjetos;

import java.util.Random;
import java.util.Scanner;

public class MascotaVirtual {
    private String nombre;
    private int nivelEnergia;

    public MascotaVirtual(String nombre) {
        this.nombre = nombre;
        this.nivelEnergia = 20; 
    }

    public void comer() {
        Random rand = new Random();
        int probabilidadEnfermar = rand.nextInt(10); 

        this.nivelEnergia += 5; 

        if (probabilidadEnfermar < 3) {
            this.nivelEnergia = 10; 
            System.out.println(this.nombre + " se ha puesto enferma por la comida.");
        }

        comunicarEstadoAnimo();
    }

    public void entrenar() {
        this.nivelEnergia -= 3;

        if (this.nivelEnergia < 5) {
            System.out.println(this.nombre + " se ha puesto enferma por el exceso de actividad física.");
        }

        comunicarEstadoAnimo();
    }

    public void dormir() {
        this.nivelEnergia += 2; 

        comunicarEstadoAnimo();
    }

    public void curar() {
        if (this.nivelEnergia < 0) {
            this.nivelEnergia = 20; 
            System.out.println(this.nombre + " ha sido curada y se siente mejor ahora.");
        } else {
            System.out.println(this.nombre + " no está enferma.");
        }

        comunicarEstadoAnimo();
    }

    private void comunicarEstadoAnimo() {
        if (this.nivelEnergia >= 50) {
            System.out.println(this.nombre + ": ¡Estoy muy contenta!");
        } else if (this.nivelEnergia >= 20) {
            System.out.println(this.nombre + ": Estoy bien.");
        } else {
            System.out.println(this.nombre + ": No me siento bien...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de Mascotas Virtuales.");
        System.out.println("Ingrese el nombre de su mascota:");
        String nombreMascota = scanner.nextLine();
        MascotaVirtual mascota = new MascotaVirtual(nombreMascota);

        boolean continuar = true;
        while (continuar) {
            
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Alimentar a la mascota");
            System.out.println("2. Hacer ejercicio con la mascota");
            System.out.println("3. Poner a dormir a la mascota");
            System.out.println("4. Curar a la mascota");
            System.out.println("5. Salir del programa");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    mascota.comer();
                    break;
                case 2:
                    mascota.entrenar();
                    break;
                case 3:
                    mascota.dormir();
                    break;
                case 4:
                    mascota.curar();
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el programa de Mascotas Virtuales!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}

