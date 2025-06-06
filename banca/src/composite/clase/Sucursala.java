package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements StructuraArborescenta{
    private List<StructuraArborescenta> listaAgentii;

    public Sucursala() {
        this.listaAgentii = new ArrayList<>();
    }

    @Override
    public void afiseazaStructuraArborescenta() {
        System.out.println("Sucursala principala:");
        for (StructuraArborescenta sa : listaAgentii) {
            sa.afiseazaStructuraArborescenta();
        }
    }

    @Override
    public void adaugaNod(StructuraArborescenta s) {
        listaAgentii.add(s);
    }

    @Override
    public void stergeNod(StructuraArborescenta s) {
        listaAgentii.remove(s);
    }

    @Override
    public void getNodCopil(int index) {
        listaAgentii.get(index);
    }
}
