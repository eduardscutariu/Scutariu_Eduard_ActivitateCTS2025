package cts.scutariu.eduard.g1099.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class StructuraArborescenta implements Code {
    private List<Code> noduri;

    public StructuraArborescenta() {
        this.noduri = new ArrayList<>();
    }

    public void addNod(Code nod) {
        this.noduri.add(nod);
    }
    public void deleteNod(Code nod) {
        this.noduri.remove(nod);
    }
    public Code getNod(int index){
        return this.noduri.get(index);
    }

    @Override
    public void verifica() {
        for(Code nod : this.noduri){
            nod.verifica();
        }
    }
}
