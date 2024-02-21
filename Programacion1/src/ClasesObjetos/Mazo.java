package ClasesObjetos;

import java.util.ArrayList;
import java.util.Random;

public class Mazo {
    private ArrayList<Naipe> naipes;

    public Mazo() {
        naipes = new ArrayList<>();
        String[] palos = {"Tréboles", "Diamantes", "Corazones", "Picas"};
        String[] rangos = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String palo : palos) {
            for (String rango : rangos) {
                naipes.add(new Naipe(palo, rango, calcularValor(rango)));
            }
        }
    }

    public Mazo(int n) {
        naipes = new ArrayList<>();
        String[] palos = {"Tréboles", "Diamantes", "Corazones", "Picas"};
        String[] rangos = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (int i = 0; i < n; i++) {
            for (String palo : palos) {
                for (String rango : rangos) {
                    naipes.add(new Naipe(palo, rango, calcularValor(rango)));
                }
            }
        }
    }

    public Naipe obtenerNaipeAleatorio() {
        Random rand = new Random();
        int index = rand.nextInt(naipes.size());
        return naipes.get(index);
    }

    public Naipe retirarNaipeAleatorio() {
        Random rand = new Random();
        int index = rand.nextInt(naipes.size());
        return naipes.remove(index);
    }

    public void agregarNaipe(Naipe naipe) {
        naipes.add(naipe);
    }

    public void agregarMazo(Mazo otroMazo) {
        naipes.addAll(otroMazo.naipes);
        otroMazo.naipes.clear();
    }

    public int tamaño() {
        return naipes.size();
    }

    private int calcularValor(String rango) {
        if (rango.equals("J") || rango.equals("Q") || rango.equals("K")) {
            return 10;
        } else if (rango.equals("A")) {
            return 11;
        } else {
            return Integer.parseInt(rango);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Naipe naipe : naipes) {
            sb.append(naipe).append("\n");
        }
        return sb.toString();
    }
}


