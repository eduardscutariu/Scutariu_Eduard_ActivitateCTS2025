package ro.cts.SimpleFactory.Main;

import ro.cts.Prototype.Rezervare.ARezervare;
import ro.cts.Prototype.Rezervare.Rezervare;
import ro.cts.SimpleFactory.Bucatarie.Bucatarie;
import ro.cts.SimpleFactory.Bucatarie.TipSupa;
import ro.cts.SimpleFactory.Supa.Supa;

public class Main {
    public static void main(String[] args) {
        Bucatarie bucatarie1= new Bucatarie(250,25.5f);
        Supa supaLegume= bucatarie1.getSupa(TipSupa.LEGUME,true,false);
        Supa supaVita=bucatarie1.getSupa(TipSupa.VITA,false,true);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();

        Bucatarie cantina= new Bucatarie(500,10.5f);
        ARezervare r1= new Rezervare("Andrei",13,2,12,true);
        ARezervare r2= r1.clonareRezervare(20);


        System.out.println(r2.toString());


    }
}
