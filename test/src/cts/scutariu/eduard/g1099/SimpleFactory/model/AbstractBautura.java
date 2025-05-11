package cts.scutariu.eduard.g1099.SimpleFactory.model;

public abstract class AbstractBautura implements Bautura,BauturaPresetata{
    protected String nume;
    protected float volum;
    protected double pret;

    protected AbstractBautura(String nume, float volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public abstract Bautura clone();

    @Override
    public String toString() {
        return "AbstractBautura{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
