package es2;

public interface Patentabile {

    public default void patenteRichiesta(String tipoPatente) {

        System.out.println(String.format("tipoPatente: %s", tipoPatente));

    }

}
