public abstract class Veicolo {

    private String brand;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Veicolo(String nome) {
        this.brand = nome;
    }

    public void avvia() {
        System.out.println("mi sto accendendo");
    }

    public void accelera() {
        System.out.println("Sto accelerando!");
    }

    public void frena() {
        System.out.println("Sto frenando!");
    }

    @Override
    public String toString() {
        return String.format("sono istanza di veicolo di nome %s", brand);
    }

}
