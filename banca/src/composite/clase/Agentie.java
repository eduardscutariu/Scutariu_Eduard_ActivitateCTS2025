package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements StructuraArborescenta{
    private List<StructuraArborescenta> listaFiliale;
    private String nume;

    public Agentie(String nume) {
        this.listaFiliale = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void afiseazaStructuraArborescenta() {
        System.out.println("Agentia: "+nume);
        for (StructuraArborescenta filiale : this.listaFiliale) {
            filiale.afiseazaStructuraArborescenta();
        }
    }

    @Override
    public void adaugaNod(StructuraArborescenta s) {
        listaFiliale.add(s);
    }

    @Override
    public void stergeNod(StructuraArborescenta s) {
        listaFiliale.remove(s);
    }

    @Override
    public void getNodCopil(int index) {
        listaFiliale.get(index);
    }
}
