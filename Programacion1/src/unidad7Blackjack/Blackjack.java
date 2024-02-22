package unidad7Blackjack;


public class Blackjack {
    private Mazo mazo;
    private Mano crupier;
    private Mano jugador;

    public Blackjack() {
        mazo = new Mazo();
        crupier = new Mano();
        jugador = new Mano();
    }

    public void repartir() {
        crupier.agregarCarta(mazo.repartir());
        crupier.agregarCarta(mazo.repartir());
        jugador.agregarCarta(mazo.repartir());
        jugador.agregarCarta(mazo.repartir());
    }

    public void pedir() {
        jugador.agregarCarta(mazo.repartir());
    }

    public void plantarse() {
    	System.out.println("Mano del crupier:");
        for (Carta carta : crupier.getCartas()) {
            System.out.println(carta);
        }
        int valorCrupier = crupier.getValor();
        System.out.println("Valor de la mano del crupier: " + valorCrupier);

        System.out.println("Tu mano:");
        for (Carta carta : jugador.getCartas()) {
            System.out.println(carta);
        }
        int valorJugador = jugador.getValor();
        System.out.println("Tu valor de mano: " + valorJugador);

        if (valorJugador > 21) {
            System.out.println("¡Te has pasado! Has perdido.");
        } else if (valorCrupier > 21 || valorJugador > valorCrupier) {
            System.out.println("¡Has ganado!");
        } else if (valorCrupier == valorJugador) {
            System.out.println("Empate.");
        } else {
            System.out.println("El crupier gana.");
            
        }
    }
}