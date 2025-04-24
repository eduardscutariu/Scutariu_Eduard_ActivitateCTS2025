package ro.cts.proxy.clase;

public class Rezervare implements IRezervare{

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora) {
        System.out.println(numeClient+" are rezervare de "+numarPersoane+" persoane la ora "+ora);
    }
}
