package proxy.clase;

public class Rezervare implements InterfataRezervare{

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("ati facut o rezervare pentru "+nrPersoane+" persoane");
    }
}
