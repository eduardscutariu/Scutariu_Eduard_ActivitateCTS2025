package observer.main;

import observer.clase.Autobuz;
import observer.clase.Utilizator;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(12);
        Utilizator utilizator=new Utilizator();
        Utilizator utilizator2=new Utilizator();
        Utilizator utilizator3=new Utilizator();

        autobuz.addObservator(utilizator);
        autobuz.addObservator(utilizator2);
        autobuz.addObservator(utilizator3);

        autobuz.pleacaDeLaCapat();
        System.out.println("\n");
        autobuz.schimbaTraseu();
    }
}
