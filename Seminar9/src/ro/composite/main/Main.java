package ro.composite.main;

import ro.composite.clase.Departament;
import ro.composite.clase.Sectie;

public class Main {
    public static void main(String[] args){
        Departament dep1=new Departament("departament general");
        Departament dep2=new Departament("cardiologie");
        Departament dep3=new Departament("pediatrie");

        Sectie sectie1=new Sectie("1");
        Sectie sectie2=new Sectie("2");


        try {
            dep1.adaugaNod(dep2);
            dep1.adaugaNod(dep3);

            dep2.adaugaNod(sectie1);
            dep3.adaugaNod(sectie2);


            dep1.descriereStructura();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
