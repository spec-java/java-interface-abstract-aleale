package esfrigo.models;

import esfrigo.interfaces.Connectible;


public class Frigo implements Connectible {
    
    private String model;
    private int capacity;


    public Frigo(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void bluetoothTurnOn(){
        System.out.println("Mi accendo e comincio a raffreddare");
    }

    @Override
    public String toString(){
        return String.format("Sono un frigo %s con capacità %d", this.model, this.capacity);
    }
}
