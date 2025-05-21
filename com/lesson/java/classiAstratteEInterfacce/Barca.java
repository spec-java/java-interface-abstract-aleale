import interfaces.Guidabile;

public class Barca extends Veicolo implements Guidabile {

    public Barca(String nome) {
        super(nome);
    }

    @Override
    public void avvia() {
        System.out.println("Sono una barca mi sto accendendo");
    }

    @Override
    public void accelera() {
        System.out.println("Sono una barca sto accelerando!");
    }

    @Override
    public void frena() {
        System.out.println("Sono una barca sto rallentando!");
    }

    @Override
    public void sterza(String doveSterzo) {
        System.out.println("Sono una barca sto sterzasndo a " + doveSterzo);
    }

}
