package flyweight.clase;

public class Client implements IClient{
    private String nume;
    private String adresa;

    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    @Override
    public void afiseazaCont(DetaliiCont detaliiCont) {
        System.out.println("Clientul "+nume+" care locuieste "+adresa+detaliiCont.toString());
    }
}
