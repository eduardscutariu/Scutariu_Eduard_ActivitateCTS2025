package ro.observer.clase;

public class Calator implements Observator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println(nume+" ai primit o notificare: "+mesaj);
    }
}
