package decorator.main;

import decorator.clase.DecoratorRezultateOnline;
import decorator.clase.IRezultate;
import decorator.clase.Rezultate;

public class Main {
    public static void main(String[] args) {
        IRezultate rezultate=new Rezultate("analize bune");
        rezultate.afiseazaRezultate();
        IRezultate analizeDecorate=new DecoratorRezultateOnline(rezultate);
        analizeDecorate.afiseazaRezultate();
    }
}
