package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends StructuraArborescenta{
    List<StructuraArborescenta> itemuri;

    public Sectiune(String denumire, int nrCopii) {
        super(denumire, nrCopii);
        this.itemuri = new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraArborescenta item) {
        itemuri.add(item);
    }

    @Override
    public void stergeNod(StructuraArborescenta item) {
        itemuri.remove(item);
    }

    @Override
    public StructuraArborescenta getNodCopil(int index) {
        return itemuri.get(index);
    }

    @Override
    public void afiseazaDescendenti() {
        System.out.println("Sectiunea: "+this.getDenumire());
        for(StructuraArborescenta item : itemuri){
            item.afiseazaDescendenti();
        }
    }
}
