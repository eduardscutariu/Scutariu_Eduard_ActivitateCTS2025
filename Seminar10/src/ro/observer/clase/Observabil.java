package ro.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observator> colectieObservatori;

    public Observabil() {
        this.colectieObservatori = new ArrayList<>();
    }

    public void abonareObservator(Observator observator){
        colectieObservatori.add(observator);
    }
    public void dezabonareObservator(Observator observator){
        colectieObservatori.remove(observator);
    }
    public void notificareObservator(String mesaj){
        colectieObservatori.forEach(observator -> observator.notificare(mesaj));
    }
}
