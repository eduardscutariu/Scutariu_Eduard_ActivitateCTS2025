package observer.clase;


public class Client implements Observator {

    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifica(String anunt) {
        System.out.println("Salut "+nume+" ai o notificare de la banca!");
        System.out.println(anunt);
    }
}
