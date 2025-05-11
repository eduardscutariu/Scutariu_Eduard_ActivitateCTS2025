package cts.scutariu.eduard.g1099.SimpleFactory.model;

public class Cafea extends AbstractBautura implements Bautura,BauturaPresetata{
    private boolean topping;

    public Cafea(String nume, float volum, double pret) {
        super(nume, volum, pret);
        this.topping = false;
    }

    @Override
    public void preparare() {
        System.out.println("macinam si apoi filtram!");
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
        return "Cafea{" +
                "topping='" + topping + '\'' +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public Bautura clone() {
        return new Cafea(this.nume,this.volum,this.pret);
    }
}
