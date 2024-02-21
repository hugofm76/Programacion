package ClasesObjetos;

public class Autor {
    private String nombre;
    private String email;
    private String genero;

    public Autor(String nombre, String email, String genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + " (" + genero + ") " + email;
    }

    public static void main(String[] args) {
     
        Autor autor1 = new Autor("Alberto Fernández", "afernandez@mail.com", "masculino");
        Autor autor2 = new Autor("María López", "mlopez@mail.com", "femenino");

        System.out.println("Autor 1: " + autor1);
        System.out.println("Autor 2: " + autor2);

        autor1.setEmail("alberto_fernandez@mail.com");
        System.out.println("Correo electrónico modificado del autor 1: " + autor1.getEmail());
    }
}

