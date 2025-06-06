package observer.clase;

import java.util.List;

public class Banca extends Observabil{
    private String nume;

    public Banca( String nume) {
        super();
        this.nume = nume;
    }
    public void notificaClienti(String anunt){
        super.notificaObservatori(anunt);
    }

}
