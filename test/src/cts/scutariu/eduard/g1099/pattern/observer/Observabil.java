package cts.scutariu.eduard.g1099.pattern.observer;

import cts.scutariu.eduard.g1099.pattern.composite.Code;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<IAplicatie> listaAplicatii;

    public Observabil() {
        this.listaAplicatii = new ArrayList<>();
    }

    public void abonareObservator(IAplicatie aplicatie) {
        listaAplicatii.add(aplicatie);
    }
    public void dezabonareObservator(IAplicatie aplicatie) {
        listaAplicatii.remove(aplicatie);
    }
    public void notificareObservatori(){
        for(IAplicatie aplicatie : listaAplicatii){
            aplicatie.notificare();
        }
    }
}
