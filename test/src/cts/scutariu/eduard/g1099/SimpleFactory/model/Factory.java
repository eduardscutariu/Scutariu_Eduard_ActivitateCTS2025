package cts.scutariu.eduard.g1099.SimpleFactory.model;

import java.util.HashMap;

public class Factory {
    public HashMap<Integer,Bautura> registru= new HashMap<>();
    public Factory() {
    }
    public Bautura getBautura(TipBautura tipBautura,String nume,float volum,float pret){
        switch (tipBautura){
            case CEAI -> {
                Bautura bautura=new Ceai(nume,volum,pret);
                registru.put(registru.size(), bautura);
                return bautura;
            }
            case CIOCOLATA_CALDA -> {
                Bautura bautura=new CiocolataCalda(nume,volum,pret);
                registru.put(registru.size(), bautura);
                return bautura;
            }
            case CAFEA -> {
                Bautura bautura=new Cafea(nume,volum,pret);
                registru.put(registru.size(), bautura);
                return bautura;
            }
            default -> {
                return null;
            }
        }
    }
}
