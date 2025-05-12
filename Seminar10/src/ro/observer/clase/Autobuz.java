package ro.observer.clase;

public class Autobuz extends Observabil {
    private int numarLinie;

    public Autobuz(int numarLinie) {
        super();
        this.numarLinie = numarLinie;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public void pleacaDeLaCapat(){
        String mesaj="Autobuzul "+numarLinie+" a plecat de la capat";
        super.notificareObservator(mesaj);
    }

}
