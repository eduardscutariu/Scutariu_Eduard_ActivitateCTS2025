package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class ClientFactory {
    private Map<String,IClient> colectieClienti;

    public ClientFactory() {
        this.colectieClienti = new HashMap<>();
    }
    public IClient getClient(String nume){
        if(colectieClienti.containsKey(nume))
            return colectieClienti.get(nume);
        else
            throw new UnsupportedOperationException("nu avem acest client");
    }
    public IClient getClient(String nume,String adresa){
        if(!colectieClienti.containsKey(nume))
            colectieClienti.put(nume,new Client(nume, adresa));
        return colectieClienti.get(nume);

    }
}
