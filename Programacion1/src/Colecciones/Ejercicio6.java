package Colecciones;

import java.util.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> contactos = new TreeMap<>();

        System.out.println("> ");

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine().trim();

            if (linea.equals("salir")) {
                break;
            }

            if (linea.startsWith("> ")) {
                linea = linea.substring(2).trim();
            } else {
                System.out.println("Comando no válido. Intente de nuevo.");
                continue;
            }

            if (linea.startsWith("buscar:")) {
                String nombre = linea.substring(7).trim();
                if (contactos.containsKey(nombre)) {
                    Set<String> telefonos = contactos.get(nombre);
                    System.out.println(String.join(", ", telefonos));
                } else {
                    System.out.println("El contacto no existe");
                }
            } else if (linea.startsWith("eliminar:")) {
                String nombre = linea.substring(9).trim();
                if (contactos.containsKey(nombre)) {
                    System.out.println("¿Está seguro que desea eliminar el contacto " + nombre + "? (s/n)");
                    String respuesta = scanner.nextLine().trim();
                    if (respuesta.equalsIgnoreCase("s")) {
                        contactos.remove(nombre);
                        System.out.println("Contacto eliminado: " + nombre);
                    } else {
                        System.out.println("Eliminación cancelada.");
                    }
                } else {
                    System.out.println("El contacto no existe");
                }
            } else if (linea.equals("contactos")) {
                for (String nombre : contactos.keySet()) {
                    System.out.println(nombre + ": " + String.join(", ", contactos.get(nombre)));
                }
            } else if (linea.contains(":")) {
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String nombre = partes[0].trim();
                    String telefono = partes[1].trim();
                    if (!contactos.containsKey(nombre)) {
                        contactos.put(nombre, new HashSet<>());
                    }
                    Set<String> telefonos = contactos.get(nombre);
                    if (!telefonos.contains(telefono)) {
                        telefonos.add(telefono);
                        System.out.println("Contacto agregado: " + nombre + " - Teléfono: " + telefono);
                    } else {
                        System.out.println("El teléfono " + telefono + " ya existe para el contacto " + nombre);
                    }
                } else {
                    System.out.println("Formato de comando incorrecto. Intente de nuevo.");
                }
            } else {
                System.out.println("Comando no reconocido. Intente de nuevo.");
            }

            System.out.println("> ");
        }

        System.out.println("Programa finalizado.");
    }
}
