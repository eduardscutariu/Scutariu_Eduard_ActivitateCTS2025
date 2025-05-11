package ro.flyweight.clase;

import ro.flyweight.main.Main;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    private Map<String,PacientAbstract> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nume, String adresa, String nrTelefon){
        if(!pacienti.containsKey(nume)){
            return pacienti.put(nume,new Pacient(nume,nrTelefon,adresa));
        }
        return pacienti.get(nume);
    }
    public PacientAbstract getPacient(String nume) throws Exception {
        if(pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }
        throw new Exception("nu avem acest pacient");
    }

}
