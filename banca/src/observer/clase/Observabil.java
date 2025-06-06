package observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observator> observatori;

    public Observabil() {
        this.observatori = new ArrayList<>();
    }


    public void addObservator(Observator observator) {
        observatori.add(observator);
    }
    public void removeObservator(Observator observator) {
        observatori.remove(observator);
    }
    public void notificaObservatori(String anunt) {
        for (Observator observator : observatori) {
            observator.notifica(anunt);
        }
    }
}
