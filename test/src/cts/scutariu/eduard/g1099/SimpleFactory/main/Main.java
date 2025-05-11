package cts.scutariu.eduard.g1099.SimpleFactory.main;

import cts.scutariu.eduard.g1099.SimpleFactory.model.*;

public class Main {
    public static void main(String[] args){
        Factory cafenea=new Factory();

        Bautura ceai=cafenea.getBautura(TipBautura.CEAI,"ceai",100.5f,10.5f);
        System.out.println(ceai);

        Bautura ceai2=cafenea.getBautura(TipBautura.CEAI,"ceaiul magic",100.5f,10.5f);
        ceai2.adaugaTopping();
        System.out.println(ceai2);

        System.out.println(ceai);

        System.out.println(ceai);
        ceai.preparare();

        Bautura cafea=cafenea.getBautura(TipBautura.CAFEA,"espresso",10.5f,1.5f);
        System.out.println(cafea);
        cafea.preparare();

        Bautura ciocolataCalda=cafenea.getBautura(TipBautura.CIOCOLATA_CALDA,"cioco",20.5f,9.5f);
        System.out.println(ciocolataCalda);
        ciocolataCalda.preparare();


    }
}
