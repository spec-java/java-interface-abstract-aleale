import interfaces.Guidabile;

public class Moto extends Veicolo implements Guidabile {

    public Moto(String nome) {
        super(nome);
    }

    @Override
    public void avvia() {
        System.out.println("Sono una moto mi sto accendendo");
    }

    @Override
    public void accelera() {
        System.out.println("Sono una moto sto accelerando!");
    }

    @Override
    public void sterza(String doveSterzo) {
        System.out.println("Sono una moto sto sterzasndo a " + doveSterzo);
    }
}
