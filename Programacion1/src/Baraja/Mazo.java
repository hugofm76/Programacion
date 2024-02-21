package Baraja;

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
                
				naipes.add(new Naipe(palo, rango));
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
                    naipes.add(new Naipe(palo, rango));
                }
            }
        }
    }

    public Naipe get() {
        Random rand = new Random();
        int index = rand.nextInt(naipes.size());
        return naipes.get(index);
    }

    public Naipe remove() {
        Random rand = new Random();
        int index = rand.nextInt(naipes.size());
        return naipes.remove(index);
    }

    public void add(Naipe naipe) {
        naipes.add(naipe);
    }
    public void addAll(Mazo otherMazo) {
        naipes.addAll(otherMazo.naipes);
        otherMazo.naipes.clear();
    }

    public int size() {
        return naipes.size();
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

