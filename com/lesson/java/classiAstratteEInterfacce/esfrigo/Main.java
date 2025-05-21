package esfrigo;

import esfrigo.models.Frigo;
import esfrigo.models.Lampadina;

public class Main {
    
     public static void main(String[] args) {

        Frigo frigo = new Frigo("Ariston", 20);
        System.out.println(frigo);
        frigo.bluetoothTurnOn();

        Lampadina lampadina = new Lampadina("Philips", 600);
        System.out.println(lampadina);
        lampadina.bluetoothTurnOn();
    }
}
