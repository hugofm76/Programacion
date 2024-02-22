package unidad7Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Mano {
    private List<Carta> cartas;

    public Mano() {
        this.cartas = new ArrayList<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getValor() {
        int valor = 0;
        for (Carta carta : cartas) {
            valor += carta.getValor();
        }
        return valor;
    }
}
