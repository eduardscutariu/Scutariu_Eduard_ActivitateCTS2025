package observer.clase;

public class Autobuz extends ObservabilAutobuz{
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }
    public void pleacaDeLaCapat(){
        super.notifyObservators("Autobuzul cu nr: "+nrAutobuz+" a plecat de la capat");
    }
    public void schimbaTraseu(){
        super.notifyObservators("Autobuzul isi va schimba ruta!");
    }
}
