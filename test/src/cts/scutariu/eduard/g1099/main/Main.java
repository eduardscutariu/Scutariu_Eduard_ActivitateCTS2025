package cts.scutariu.eduard.g1099.main;

import cts.scutariu.eduard.g1099.pattern.composite.Clasa;
import cts.scutariu.eduard.g1099.pattern.composite.Metoda;
import cts.scutariu.eduard.g1099.pattern.composite.StructuraArborescenta;
import cts.scutariu.eduard.g1099.pattern.composite.UnitateCod;
import cts.scutariu.eduard.g1099.pattern.observer.Aplicatie;
import cts.scutariu.eduard.g1099.pattern.observer.CodObservabil;
import cts.scutariu.eduard.g1099.pattern.observer.IAplicatie;
import cts.scutariu.eduard.g1099.pattern.observer.Observabil;

public class Main {
    public static void main(String[] args) {
        StructuraArborescenta clasa= new Clasa("student");

        StructuraArborescenta metoda1= new Metoda("invata");
        StructuraArborescenta metoda2= new Metoda("mananca");

        StructuraArborescenta unitateCod1= new UnitateCod("printf(ceva)");
        StructuraArborescenta unitateCod2= new UnitateCod("len(string c)==2");
        StructuraArborescenta unitateCod3= new UnitateCod("printf(ceva) if x ==0");
        StructuraArborescenta unitateCod4= new UnitateCod("while do");

        clasa.addNod(metoda1);
        clasa.addNod(metoda2);

        metoda1.addNod(unitateCod1);
        metoda1.addNod(unitateCod2);

        metoda2.addNod(unitateCod3);
        metoda2.addNod(unitateCod4);

        clasa.verifica();

        Observabil codeObservabil=new CodObservabil();
        IAplicatie aplicatie=new Aplicatie();

        codeObservabil.abonareObservator(aplicatie);

        codeObservabil.notificareObservatori();



    }
}
