package unidad7Biblioteca;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        Libro libro1 = new Libro(1, "Java Programming", 2019, "John Smith");
        Libro libro2 = new Libro(2, "Python Basics", 2020, "Alice Johnson");
        
        Revista revista1 = new Revista(101, "Mayo", 15, 2021, 0, 0);
        Revista revista2 = new Revista(102, "Junio", 20, 2021, 0, 0);
        
        publicaciones.add(libro1);
        publicaciones.add(libro2);
        publicaciones.add(revista1);
        publicaciones.add(revista2);

        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion); 
        }
    }
}

