package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements StructuraArborescenta{
    List<StructuraArborescenta> listaGrupuri;

    public Flota() {
        this.listaGrupuri = new ArrayList<>();
    }

    @Override
    public void descrieStructura() {

        for(StructuraArborescenta grup : listaGrupuri) {
            grup.descrieStructura();
        }
    }

    @Override
    public void adaugaNod(StructuraArborescenta grup) {
        listaGrupuri.add(grup);
    }

    @Override
    public void stergeNod(StructuraArborescenta a) {
        listaGrupuri.remove(a);
    }

    @Override
    public void getNodCopil(int index) {
        listaGrupuri.get(index);
    }
}
