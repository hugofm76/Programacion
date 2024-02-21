package unidad7Electrodomesticos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Lavadora lavadora = new Lavadora();
        Frigorifico frigorifico = new Frigorifico();
        Television television = new Television();

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        electrodomesticos.add(lavadora);
        electrodomesticos.add(frigorifico);
        electrodomesticos.add(television);
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(electrodomestico.toString());
        }
    }
}

