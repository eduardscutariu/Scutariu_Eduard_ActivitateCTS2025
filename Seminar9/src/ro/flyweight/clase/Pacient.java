package ro.flyweight.clase;

public class Pacient implements PacientAbstract{
    private String name;
    private String numarTelefon;
    private String adresa;

    public Pacient(String name, String numarTelefon, String adresa) {
        this.name = name;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void afisareInformatii(Spitalizare s) {
        System.out.println(this.toString()+"\n"+s.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
