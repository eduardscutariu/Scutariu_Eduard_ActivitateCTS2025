package ro.cts.SimpleFactory.Anunturi;

import java.util.HashMap;
import java.util.Map;

public class AgentieImobiliara {
    private String nume;
    private int cifraAfaceri;
    private Map<String,Anunt> anunturi= new HashMap<>();

    public AgentieImobiliara(String nume, int cifraAfaceri) {
        this.nume = nume;
        this.cifraAfaceri = cifraAfaceri;
    }

    public Anunt getAnunt(String adresa,String proprietar,int numarCamere){
        if(!anunturi.containsKey(adresa)){
            Anunt anunt= new Anunt(adresa,proprietar,numarCamere,anunturi.size()+1);
            anunturi.put(adresa,anunt);
        }
        return  anunturi.get(adresa);
    }

}
