package ClasesObjetos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Entrenador {
    private String nombre;
    private int insignias;
    private ArrayList<Pokemon> pokemons;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.insignias = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getInsignias() {
        return insignias;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void ganarInsignia() {
        insignias++;
    }

    public void perderSaludPokemons(String elemento) {
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon pokemon = pokemons.get(i);
            if (pokemon.getElemento().equals(elemento)) {
                ganarInsignia();
            } else {
                pokemon.perderSalud();
                if (pokemon.getSalud() <= 0) {
                    pokemons.remove(i);
                    i--; 
                }
            }
        }
    }

    public int getPokemonsRestantes() {
        return pokemons.size();
    }

    @Override
    public String toString() {
        return nombre + " " + insignias + " " + getPokemonsRestantes();
    }
}

class Pokemon {
    private String nombre;
    private String elemento;
    private int salud;

    public Pokemon(String nombre, String elemento, int salud) {
        this.nombre = nombre;
        this.elemento = elemento;
        this.salud = salud;
    }

    public String getElemento() {
        return elemento;
    }

    public int getSalud() {
        return salud;
    }

    public void perderSalud() {
        salud -= 10;
    }
}

public class TorneoPokemon {
    public static void main(String[] args) {
    	System.out.println("Este programa simula torneos de pokemons.");
        System.out.println();
        System.out.println("Cada entrenador tiene un nombre único y comienza con cero insignias.");
        System.out.println("Se recibirán un número indeterminado de líneas en la entrada estándar seguidas de una linea con");
        System.out.println("la palabra “torneo”. Cada una de estas líneas contiene información acerca de un pokemos y del");
        System.out.println("entrenador que lo ha capturado con el formato: <nombre del entrenador> <nombre del pokemon>");
        System.out.println("<elemento fundamental del pokemon> <salud del pokemon>.");
        System.out.println("A la línea con la palabra “torneo” le sigue un número indeterminado de líneas, cada una");
        System.out.println("conteniendo el nombre de uno de los elementos fundamentales (fuego, agua, electricidad, …)");
        System.out.println("seguidas de una línea con la palabra “fin”. Por cada una de esta líneas se ha de comprobar, por");
        System.out.println("cada entrenador, si éste tiene al menos un pokemon ligado al elemento leido. Si es así, recibirá una");
        System.out.println("insignia. En caso contrario, todos sus pokemons perderán 10 puntos de salud y aquellos que llegen");
        System.out.println("a cero puntos de salud morirán, por lo que tendrán que ser eliminados de la colección del");
        System.out.println("entrenador.");
        System.out.println("Cuando se lee la línea con la palabra “fin”, el torneo finaliza y se mostrará una lista de entrenadores");
        System.out.println("en la que en cada línea se visualizara el nombre de un entrenador, su cantidad de insignias y el");
        System.out.println("número de pokemos que le quedan.");
        
        Scanner scanner = new Scanner(System.in);
        Map<String, Entrenador> entrenadores = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("torneo")) {
            String[] datosPokemon = input.split(" ");
            String nombreEntrenador = datosPokemon[0];
            String nombrePokemon = datosPokemon[1];
            String elementoPokemon = datosPokemon[2];
            int saludPokemon = Integer.parseInt(datosPokemon[3]);

            Entrenador entrenador = entrenadores.getOrDefault(nombreEntrenador, new Entrenador(nombreEntrenador));
            entrenador.addPokemon(new Pokemon(nombrePokemon, elementoPokemon, saludPokemon));
            entrenadores.put(nombreEntrenador, entrenador);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("fin")) {
            for (Entrenador entrenador : entrenadores.values()) {
                entrenador.perderSaludPokemons(input);
            }
            input = scanner.nextLine();
        }

        ArrayList<Entrenador> listaEntrenadores = new ArrayList<>(entrenadores.values());
        for (Entrenador entrenador : listaEntrenadores) {
            System.out.println(entrenador);
        }

        scanner.close();
    }
}
