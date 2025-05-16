package composite.main;

import composite.clase.Autobuz;
import composite.clase.Flota;
import composite.clase.Grup;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota();

        Grup grupMici=new Grup("mici_10locuri");
        Grup grupMedii=new Grup("medii_10locuri");
        Grup grupMari=new Grup("mari_10locuri");

        Autobuz autobuz1=new Autobuz("iveco","transport",10);
        Autobuz autobuz2=new Autobuz("iveco","transport",10);
        Autobuz autobuz3=new Autobuz("iveco","transport",30);
        Autobuz autobuz4=new Autobuz("iveco","transport",30);
        Autobuz autobuz5=new Autobuz("iveco","transport",50);
        Autobuz autobuz6=new Autobuz("iveco","transport",50);
        Autobuz autobuz7=new Autobuz("iveco","transport",50);

        flota.adaugaNod(grupMici);
        flota.adaugaNod(grupMedii);
        flota.adaugaNod(grupMari);

        grupMici.adaugaNod(autobuz1);
        grupMici.adaugaNod(autobuz2);

        grupMedii.adaugaNod(autobuz3);
        grupMedii.adaugaNod(autobuz4);

        grupMari.adaugaNod(autobuz5);
        grupMari.adaugaNod(autobuz6);
        grupMedii.adaugaNod(autobuz7);

        flota.descrieStructura();
    }
}
