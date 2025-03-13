package ro.cts.Anunturi;

public class Anunt {
    private String adresa;
    private String proprietar;
    private int numarCamere;
    private int numarAnunt;

    protected Anunt(String adresa, String proprietar, int numarCamere, int numarAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.numarCamere = numarCamere;
        this.numarAnunt = numarAnunt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Anunt{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", proprietate='").append(proprietar).append('\'');
        sb.append(", numarCamere=").append(numarCamere);
        sb.append(", numarAnunt=").append(numarAnunt);
        sb.append('}');
        return sb.toString();
    }
}
