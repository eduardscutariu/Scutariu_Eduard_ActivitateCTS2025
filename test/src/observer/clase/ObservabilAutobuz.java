package observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservabilAutobuz {
    private List<Observator> listaObservatori;
    public ObservabilAutobuz() {
        this.listaObservatori = new ArrayList<>();
    }
    public void addObservator(Observator observator) {
        this.listaObservatori.add(observator);
    }
    public void deleteObservator(Observator observator) {
        this.listaObservatori.remove(observator);
    }
    public void notifyObservators(String mesaj) {
        for (Observator observator : listaObservatori) {
            observator.notificare(mesaj);
        }
    }

}
