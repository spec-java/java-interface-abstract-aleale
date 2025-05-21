package esvideogioco;

public class Main {
    
    public static void main(String[] args) {
    CurrentGame partita = new CurrentGame();
    GestioneVideogioco.start(partita);
    partita.gioco();
    partita.gioco();
    partita.gioco();
    GestioneVideogioco.gameOver(partita);
    }
}
