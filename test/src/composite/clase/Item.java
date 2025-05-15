package composite.clase;

public class Item extends StructuraArborescenta{

    public Item(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void adaugaNod(StructuraArborescenta nod) {
        throw new UnsupportedOperationException("nod frunza");
    }

    @Override
    public void stergeNod(StructuraArborescenta nod) {
        throw new UnsupportedOperationException("nod frunza");
    }

    @Override
    public StructuraArborescenta getNodCopil(int index) {
        return this;
    }



    @Override
    public void afiseazaDescendenti() {
        System.out.println(this.getDenumire()+" "+this.getPret());
    }
}
