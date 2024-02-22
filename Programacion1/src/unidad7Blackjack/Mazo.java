package unidad7Blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mazo {
    private List<Carta> cartas;

    public Mazo() {
        this.cartas = new ArrayList<>();
        inicializarMazo();
    }

    private void inicializarMazo() {
    	String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String palo : palos) {
            for (String valor : valores) {
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
    }
    

    public Carta repartir() {
    	Random random = new Random();
    	int indiceCarta = random.nextInt(cartas.size());
        Carta cartaRepartida = cartas.get(indiceCarta);
        cartas.remove(indiceCarta);
        return cartaRepartida;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }
}

