package Colecciones;

import java.time.LocalTime;
import java.util.*;

class Robot {
    private String nombre;
    private int tiempoProceso;

    public Robot(String nombre, int tiempoProceso) {
        this.nombre = nombre;
        this.tiempoProceso = tiempoProceso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoProceso() {
        return tiempoProceso;
    }
}

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Robot> robots = new ArrayList<>();
        Queue<String> productos = new LinkedList<>();

        String[] robotData = scanner.nextLine().split(";");
        for (String data : robotData) {
            String[] parts = data.split("-");
            robots.add(new Robot(parts[0], Integer.parseInt(parts[1])));
        }

        LocalTime horaComienzo = LocalTime.parse(scanner.nextLine());

        String producto;
        while (!(producto = scanner.nextLine()).equals("fin")) {
            productos.add(producto);
        }

        procesarProductos(robots, productos, horaComienzo);
    }

    private static void procesarProductos(List<Robot> robots, Queue<String> productos, LocalTime horaComienzo) {
        while (!productos.isEmpty()) {
            for (Robot robot : robots) {
                if (!productos.isEmpty()) {
                    String producto = productos.poll();
                    System.out.println(robot.getNombre() + " va a procesar " + producto + " a las " + horaComienzo);
                    horaComienzo = horaComienzo.plusSeconds(robot.getTiempoProceso());
                }
            }
        }
    }
}

