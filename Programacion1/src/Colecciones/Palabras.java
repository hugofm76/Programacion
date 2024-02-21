package Colecciones;

import java.util.*;

public class Palabras {
    private Map<Integer, Set<String>> palabrasPorLongitud;

    public Palabras() {
        palabrasPorLongitud = new HashMap<>();
    }

    public Palabras(String texto) {
        palabrasPorLongitud = new HashMap<>();
        agregarPalabras(texto);
    }

    public void agregarPalabra(String palabra) {
        if (!palabrasPorLongitud.containsKey(palabra.length())) {
            palabrasPorLongitud.put(palabra.length(), new TreeSet<>());
        }
        palabrasPorLongitud.get(palabra.length()).add(palabra);
    }

    public void agregarPalabras(String texto) {
        String[] palabras = texto.split("\\s+");
        for (String palabra : palabras) {
            agregarPalabra(palabra);
        }
    }

    public boolean contienePalabra(String palabra) {
        for (Set<String> palabras : palabrasPorLongitud.values()) {
            if (palabras.contains(palabra)) {
                return true;
            }
        }
        return false;
    }

    public List<String> obtenerListaPalabras(int longitud) {
        if (palabrasPorLongitud.containsKey(longitud)) {
            return new ArrayList<>(palabrasPorLongitud.get(longitud));
        }
        return Collections.emptyList();
    }

    public void borrarPalabras() {
        palabrasPorLongitud.clear();
    }

    public void reemplazarPalabras(String texto) {
        borrarPalabras();
        agregarPalabras(texto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palabras palabras = new Palabras();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Introduce un comando: ");
            String comando = scanner.nextLine();

            switch (comando) {
                case "añadir":
                    System.out.println("Escribe las palabras separadas por espacios:");
                    String palabrasAAgregar = scanner.nextLine();
                    palabras.agregarPalabras(palabrasAAgregar);
                    break;
                case "lista":
                    System.out.println("Introduce la longitud de las palabras:");
                    int longitud = scanner.nextInt();
                    scanner.nextLine(); 
                    List<String> listaPalabras = palabras.obtenerListaPalabras(longitud);
                    System.out.println("Palabras de longitud " + longitud + ": " + listaPalabras);
                    break;
                case "borrar":
                    palabras.borrarPalabras();
                    break;
                case "borrar:":
                    System.out.println("Escribe las nuevas palabras separadas por espacios:");
                    String nuevasPalabras = scanner.nextLine();
                    palabras.reemplazarPalabras(nuevasPalabras);
                    break;
                case "fin":
                    palabras.borrarPalabras();
                    continuar = false;
                    break;
                default:
                    System.out.println("Comando no reconocido.");
            }
        }
    }
}

