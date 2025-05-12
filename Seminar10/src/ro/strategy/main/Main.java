package ro.strategy.main;

import ro.strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata plataSMS=new SMS();
        IMetodaPlata plataCardCalatorie=new CardCalatorii(100);
        IMetodaPlata plataCardBancar=new CardBancar(200);
        Calator calator1= new Calator("andrei",plataSMS);

        calator1.platesteBilet(10);
        calator1.setMetodaPlata(plataCardCalatorie);
        calator1.platesteBilet(200);
    }
}
