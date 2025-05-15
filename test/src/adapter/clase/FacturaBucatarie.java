package adapter.clase;

public class FacturaBucatarie{
    private int numar;
    private Float pret;

    public FacturaBucatarie(int numar, Float pret) {
        this.numar = numar;
        this.pret = pret;
    }

    public int getNumar() {
        return numar;
    }

    public Float getPret() {
        return pret;
    }

    public void printeazaFactura() {
        System.out.println("Factura Bucatarie: " + numar + "\t" + pret);
    }
}
