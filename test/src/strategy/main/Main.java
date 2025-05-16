package strategy.main;

import strategy.clase.*;

public class Main {
    public static void main(String[] args) {
        Calator calator=new Calator("eduard");
        MetodaPlata plataSMS=new PlataSMS(1);
        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie();
        calator.platesteCalatorie();
        MetodaPlata plataCardBancar=new PlataCardBancar(5);
        calator.setMetodaPlata(plataCardBancar);
        calator.platesteCalatorie();
        calator.platesteCalatorie();
        MetodaPlata plataCardCalatorii=new PlataCardCalatorii(3);
        calator.setMetodaPlata(plataCardCalatorii);
        calator.platesteCalatorie();
        calator.platesteCalatorie();
        calator.platesteCalatorie();
        calator.platesteCalatorie();
    }
}
