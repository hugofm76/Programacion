package ClasesObjetos;

public class Naipe {
    private String palo;
    private String rango;
    private int valor;

    // Constructor que inicializa el naipe con palo, rango y valor
    public Naipe(String palo, String rango, int valor) {
        this.palo = palo;
        this.rango = rango;
        this.valor = valor;
    }

    // Getters y setters
    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Redefinición del método toString
    @Override
    public String toString() {
        return rango + " de " + palo;
    }

    public static void main(String[] args) {
        // Crear instancias de la clase Naipe y probar los métodos
        Naipe naipe1 = new Naipe("Tréboles", "Ace", 11);
        Naipe naipe2 = new Naipe("Diamantes", "10", 10);

        // Mostrar información de los naipes
        System.out.println("Naipe 1: " + naipe1);
        System.out.println("Naipe 2: " + naipe2);

        // Cambiar el valor del segundo naipe y mostrar los cambios
        naipe2.setValor(5);
        System.out.println("Naipe 2 (valor modificado): " + naipe2.getValor());
    }
}
