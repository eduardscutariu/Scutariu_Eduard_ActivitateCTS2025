package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Meniu extends StructuraArborescenta{
    List<StructuraArborescenta> sectiuni;

    public Meniu(String denumire, int nrCopii) {
        super(denumire, nrCopii);
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaNod(StructuraArborescenta sectiune) {
        sectiuni.add(sectiune);
    }

    @Override
    public void stergeNod(StructuraArborescenta sectiune) {
        sectiuni.remove(sectiune);
    }

    @Override
    public StructuraArborescenta getNodCopil(int index) {
        return sectiuni.get(index);
    }

    @Override
    public void afiseazaDescendenti() {
        System.out.println("Meniu: ");
        for (StructuraArborescenta sectiune : sectiuni){
            sectiune.afiseazaDescendenti();
        }

    }
}
