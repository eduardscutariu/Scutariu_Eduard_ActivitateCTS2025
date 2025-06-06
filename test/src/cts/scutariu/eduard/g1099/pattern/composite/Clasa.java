package cts.scutariu.eduard.g1099.pattern.composite;

public class Clasa extends StructuraArborescenta{
    private String nume;

    public Clasa(String nume) {
        this.nume = nume;
    }

    @Override
    public void verifica() {
        System.out.println("Clasa: "+nume);
        super.verifica();
    }
}
