package cts.scutariu.eduard.g1099.pattern.observer;

public class Aplicatie implements IAplicatie{

    @Override
    public void notificare() {
        System.out.println("Codul a fost modificat!");
    }
}
