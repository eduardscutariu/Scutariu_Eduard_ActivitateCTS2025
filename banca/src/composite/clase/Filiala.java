package composite.clase;

public class Filiala implements StructuraArborescenta{
    private String nume;

    public Filiala(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructuraArborescenta() {
        System.out.println("Filiala: " + nume);
    }

    @Override
    public void adaugaNod(StructuraArborescenta s) {
        throw new UnsupportedOperationException("nod final");
    }

    @Override
    public void stergeNod(StructuraArborescenta s) {
        throw new UnsupportedOperationException("nod final");
    }

    @Override
    public void getNodCopil(int index) {
        throw new UnsupportedOperationException("nod final");
    }
}
