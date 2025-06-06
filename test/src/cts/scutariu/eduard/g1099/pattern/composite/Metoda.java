package cts.scutariu.eduard.g1099.pattern.composite;

public class Metoda extends StructuraArborescenta{
    private String nume;

    public Metoda(String nume) {
        this.nume = nume;
    }

    @Override
    public void verifica() {
        System.out.println("Metoda: "+nume);
        super.verifica();
    }
}
