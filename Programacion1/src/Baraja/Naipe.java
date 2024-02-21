package Baraja;

public class Naipe {
    private String palo;
    private String rango;
    private int valor;

    public Naipe(String palo, String rango) {
        this.palo = palo;
        this.rango = rango;
    }

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

    @Override
    public String toString() {
        return rango + " de " + palo;
    }
}