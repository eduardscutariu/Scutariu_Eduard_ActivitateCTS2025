package adapter.clase;

public class FacturaBar{
    private int numar;
    private Float pret;

    public FacturaBar(int numar, Float pret) {
        this.numar = numar;
        this.pret = pret;
    }

    public void printeazaFactura(){
        System.out.println("Factura Bar: " + numar + "\t" + pret);
    }
}
