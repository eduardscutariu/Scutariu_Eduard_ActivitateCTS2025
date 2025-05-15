package composite.clase;

public abstract class StructuraArborescenta {
    private String denumire;
    private int pret;

    public StructuraArborescenta(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public abstract void adaugaNod(StructuraArborescenta nod);
    public abstract void stergeNod(StructuraArborescenta nod);
    public abstract StructuraArborescenta getNodCopil(int index);

    public abstract void afiseazaDescendenti();
}
