package esvideogioco;

public interface GestioneVideogioco {
    
    static void start(CurrentGame partita){
        partita.setIsAlive(true);
        System.out.println("La partita inizia");
    }

    static void gameOver(CurrentGame partita){
        partita.setIsAlive(false);
        System.out.println("La partita è finita, punteggio: " + partita.getPunteggio());
    }
}
