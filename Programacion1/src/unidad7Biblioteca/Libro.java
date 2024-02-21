package unidad7Biblioteca;

public class Libro extends Publicacion {
    
    private String autor;

    public Libro(int codigo, String titulo, int añoPublicacion, String autor) {
        super(codigo, titulo, añoPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [" +
                "codigo=" + getCodigo() +
                ", titulo='" + getTitulo() + '\'' +
                ", añoPublicacion=" + getAñoPublicacion() +
                ", autor='" + autor + '\'' +
                ']';
    }
}