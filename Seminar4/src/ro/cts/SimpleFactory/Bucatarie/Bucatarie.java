package ro.cts.SimpleFactory.Bucatarie;

import ro.cts.SimpleFactory.Supa.Supa;
import ro.cts.SimpleFactory.Supa.SupaCiuperci;
import ro.cts.SimpleFactory.Supa.SupaLegume;
import ro.cts.SimpleFactory.Supa.SupaVita;

public class Bucatarie {
    private int cantitate;
    private float pret;

    public Bucatarie(int cantitate, float pret) {
        this.cantitate = cantitate;
        this.pret = pret;
    }

    public Supa getSupa(TipSupa tipSupa, Boolean hasArdei, Boolean hasSmantana){
        switch (tipSupa){
            case CIUPERCI -> {
                return new SupaCiuperci(cantitate,pret,hasArdei,hasSmantana);
            }
            case VITA -> {
                return new SupaVita(cantitate,pret,hasArdei,hasSmantana);
            }
            case LEGUME -> {
                return new SupaLegume(cantitate,pret,hasArdei,hasSmantana);
            }
            default ->{
                return null;
            }
        }

    }
}
