package cts.scutariu.eduard.g1099.pattern.observer;

import java.util.List;

public class CodObservabil extends Observabil {

    public void modificaCod(){
        super.notificareObservatori();
    }
}
