package adapter.main;

import adapter.clase.Adaptor;
import adapter.clase.FacturaBar;
import adapter.clase.FacturaBucatarie;

public class Main {
    public static void printareFactura(FacturaBar facturaBar){
        facturaBar.printeazaFactura();
    }
    public static void main(String[] args) {
        FacturaBar facturaBar=new FacturaBar(1,100.5f);
        printareFactura(facturaBar);
        FacturaBucatarie facturaBucatarie= new FacturaBucatarie(2,205.8f);
        FacturaBar facturaBar2=new Adaptor(facturaBucatarie);
        printareFactura(facturaBar2);


    }
}
