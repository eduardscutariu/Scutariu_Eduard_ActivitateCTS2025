package cts.scutariu.eduard.g1099.SimpleFactory.model;

public class CiocolataCalda extends AbstractBautura implements Bautura,BauturaPresetata{

    private boolean topping;

    public CiocolataCalda(String nume, float volum, double pret) {
        super(nume, volum, pret);
        this.topping = false;
    }

    @Override
    public void preparare() {
        System.out.println("turnam apa peste ciocolata!");
    }

    @Override
    public String getDetalii() {
        return "e facuta cu simt";
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public void adaugaTopping() {
        this.topping=true;
    }



    @Override
    public String toString() {
        return "CiocolataCalda{" +
                "topping='" + topping + '\'' +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public Bautura clone() {
        return new CiocolataCalda(this.nume,this.volum,this.pret);
    }
}
