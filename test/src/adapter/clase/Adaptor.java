package adapter.clase;

public class Adaptor extends FacturaBar {
    private FacturaBucatarie facturaBucatarie;

    public Adaptor(FacturaBucatarie facturaBucatarie) {
        super(facturaBucatarie.getNumar(), facturaBucatarie.getPret());
        this.facturaBucatarie = facturaBucatarie;
    }

    @Override
    public void printeazaFactura() {
        facturaBucatarie.printeazaFactura();
    }
}
