package ro.flyweight.main;

import ro.flyweight.clase.Pacient;
import ro.flyweight.clase.PacientAbstract;
import ro.flyweight.clase.Receptie;
import ro.flyweight.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        Receptie receptie=new Receptie();
        PacientAbstract pacient1=receptie.getPacient("eduard","victoriei","0712344678");
        PacientAbstract pacient2=receptie.getPacient("andrei","dorobanti","0712345608");
        PacientAbstract pacient3=receptie.getPacient("matei","obor","0712325678");

        Spitalizare spitalizare1=new Spitalizare(1,12,3);
        Spitalizare spitalizare2=new Spitalizare(1,12,3);
        Spitalizare spitalizare3=new Spitalizare(1,12,3);
        Spitalizare spitalizare4=new Spitalizare(1,12,3);

        try {
            receptie.getPacient("eduard").afisareInformatii(spitalizare2);
            receptie.getPacient("andrei").afisareInformatii(spitalizare2);
            receptie.getPacient("andrei").afisareInformatii(spitalizare1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
