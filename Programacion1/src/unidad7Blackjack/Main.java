package unidad7Blackjack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Blackjack blackjack = new Blackjack();
        Scanner scanner = new Scanner(System.in);
        String comando;

        do {
            System.out.print("Blackjack> ");
            comando = scanner.nextLine();

            switch (comando) {
                case "repartir":
                    blackjack.repartir();
                    break;
                case "pedir":
                    blackjack.pedir();
                    break;
                case "plantarse":
                    blackjack.plantarse();
                    break;
                case "fin":
                    break;
                default:
                    System.out.println("Comando inválido.");
                    break;
            }
        } while (!comando.equals("fin"));

        scanner.close();
    }

	}

