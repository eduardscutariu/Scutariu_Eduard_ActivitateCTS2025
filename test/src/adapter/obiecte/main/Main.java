package adapter.obiecte.main;

import adapter.obiecte.clase.Adapter;
import adapter.obiecte.clase.BiletAutobuz;
import adapter.obiecte.clase.BiletMetrou;

public class Main {
    public static void platesteTransportul(BiletMetrou biletMetrou){
        biletMetrou.platesteCalatorie();
    }
    public static void main(String[] args) {
        BiletMetrou biletMetrou=new BiletMetrou(1);
        BiletAutobuz biletAutobuz=new BiletAutobuz(1);
        platesteTransportul(new Adapter(biletAutobuz));
        platesteTransportul(new Adapter(biletAutobuz));
    }
}
