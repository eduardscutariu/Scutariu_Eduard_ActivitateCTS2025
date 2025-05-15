package composite.main;

import composite.clase.Item;
import composite.clase.Meniu;
import composite.clase.Sectiune;
import composite.clase.StructuraArborescenta;

public class Main {
    public static void main(String[] args) {
        StructuraArborescenta meniu=new Meniu("meniu",5);

        StructuraArborescenta sectiune1= new Sectiune("bauturi",5);
        StructuraArborescenta sectiune2= new Sectiune("mancare",5);

        StructuraArborescenta item1=new Item("cola",10);
        StructuraArborescenta item2=new Item("pizza",10);
        StructuraArborescenta item3=new Item("shaorma",10);

        meniu.adaugaNod(sectiune1);
        meniu.adaugaNod(sectiune2);

        sectiune1.adaugaNod(item1);
        sectiune2.adaugaNod(item2);
        sectiune2.adaugaNod(item3);

        meniu.afiseazaDescendenti();




    }
}
