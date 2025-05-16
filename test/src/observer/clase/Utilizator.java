package observer.clase;

public class Utilizator implements Observator{

    @Override
    public void notificare(String mesaj) {
        System.out.println(mesaj);
    }
}
