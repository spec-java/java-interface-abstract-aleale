import interfaces.Guidabile;

public class Automobile extends Veicolo implements Guidabile {

    public Automobile(String nome) {
        super(nome);

    }

    @Override
    public void avvia() {
        System.out.println("Sono un'auto mi sto accendendo");
    }

    @Override
    public void accelera() {
        System.out.println("Sono un'auto sto accelerando!");
    }

    @Override
    public void frena() {
        System.out.println("Sono un'auto sto frenando!");
    }

    @Override
    public void sterza(String doveSterzo) {
        System.out.println("Sono un'auto sto sterzasndo a " + doveSterzo);
    }

}
