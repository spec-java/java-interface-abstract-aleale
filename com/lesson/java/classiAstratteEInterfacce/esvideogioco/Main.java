package esvideogioco;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    CurrentGame partita = new CurrentGame();
    GestioneVideogioco.start(partita);

    Scanner scanner = new Scanner(System.in);
    String input;

    do {
            partita.gioco();
            System.out.print("Vuoi continuare a giocare? (n per terminare): ");
            input = scanner.nextLine();
        } while (!input.equalsIgnoreCase("n"));

    GestioneVideogioco.gameOver(partita);
    scanner.close();
    }
}
