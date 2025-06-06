package composite.main;

import composite.clase.Agentie;
import composite.clase.Filiala;
import composite.clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        Sucursala sucursala=new Sucursala();

        Agentie agentie1=new Agentie("galati");
        Agentie agentie2=new Agentie("braila");
        Agentie agentie3=new Agentie("bucuresti");

        Filiala filiala1=new Filiala("cosbuc");
        Filiala filiala2=new Filiala("stefan cel mare");
        Filiala filiala3=new Filiala("snagov");

        sucursala.adaugaNod(agentie1);
        sucursala.adaugaNod(agentie2);
        sucursala.adaugaNod(agentie3);

        agentie1.adaugaNod(filiala1);
        agentie1.adaugaNod(filiala2);
        agentie2.adaugaNod(filiala3);

        sucursala.afiseazaStructuraArborescenta();
    }
}
