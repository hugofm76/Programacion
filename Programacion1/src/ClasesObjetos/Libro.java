package ClasesObjetos;

import java.util.ArrayList;
import java.util.Collection;

public class Libro {
    private String titulo;
    private Collection<Autor> autores;
    private float precio;
    private int stock;

    public Libro(String titulo, Collection<Autor> autores, float precio) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.stock = 0; 
    }

    public Libro(String titulo, Collection<Autor> autores, float precio, int stock) {
        this.titulo = titulo;
        this.autores = autores;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public Collection<Autor> getAutores() {
        return autores;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder autoresStr = new StringBuilder();
        for (Autor autor : autores) {
            autoresStr.append(autor.getNombre()).append(", ");
        }
        autoresStr.delete(autoresStr.length() - 2, autoresStr.length()); // Eliminar la última coma y espacio

        return titulo + " (" + autoresStr + ") " + precio + "€ - " + stock + " unidades en stock";
    }

    public static void main(String[] args) {
       
        Autor autor1 = new Autor("Juan Pérez", "jperez@mail.com", "masculino");
        Autor autor2 = new Autor("Ana Gómez", "agomez@mail.com", "femenino");

        Collection<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        Libro libro1 = new Libro("Java Programming", autores, 29.99f);
        System.out.println(libro1);

        libro1.setPrecio(34.99f);
        libro1.setStock(100);
        System.out.println("Libro 1 (modificado): " + libro1);
    }
}

