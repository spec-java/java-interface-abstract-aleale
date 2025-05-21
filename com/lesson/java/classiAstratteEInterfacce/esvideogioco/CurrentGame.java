package esvideogioco;

public class CurrentGame {
    
    private boolean isAlive;
    private int punteggio;

    public void gioco(){
        if(isAlive){
            punteggio++;
            System.out.println("Punteggio: " + punteggio);
        }
    }

    public boolean isIsAlive() {
        return this.isAlive;
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }


    public int getPunteggio() {
        return this.punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }


}
