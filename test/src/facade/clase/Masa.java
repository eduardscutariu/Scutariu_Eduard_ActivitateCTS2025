package facade.clase;

public class Masa {
    private int numar;
    private boolean isLibera;

    public Masa(int numar, boolean isLibera) {
        this.numar = numar;
        this.isLibera = isLibera;
    }

    public int getNumar() {
        return numar;
    }

    public boolean isLibera() {
        return isLibera;
    }
}
