package esfrigo.models;

import esfrigo.interfaces.Connectible;

public class Lampadina implements Connectible {
    
    private String model;
    private int lumen;


    public Lampadina(String model, int lumen) {
        this.model = model;
        this.lumen = lumen;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getLumen() {
        return this.lumen;
    }

    public void setLumen(int lumen) {
        this.lumen = lumen;
    }

    public void bluetoothTurnOn(){
        System.out.println("Mi accendo e faccio luce");
    }

     @Override
    public String toString(){
        return String.format("Sono una lampadina %s con lumen %d", this.model, this.lumen);
    }
}
