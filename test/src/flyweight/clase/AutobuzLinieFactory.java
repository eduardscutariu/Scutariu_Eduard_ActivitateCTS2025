package flyweight.clase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutobuzLinieFactory {
    private Map<Integer,AutobuzLinie> colectieAutobuzLinie;

    public AutobuzLinieFactory() {
        this.colectieAutobuzLinie = new HashMap<>();
    }

    public AutobuzLinie getAutobuzLinie(int numar){
        if(colectieAutobuzLinie.containsKey(numar)){
            return colectieAutobuzLinie.get(numar);
        }
        else{
            System.out.println("nu avem acel autobuz");
            return null;
        }
    }

    public AutobuzLinie getAutobuzLinie(int numar,String model,int anFabricatie,int nrLocuri){
        if(!colectieAutobuzLinie.containsKey(numar)){
            colectieAutobuzLinie.put(numar,new AutobuzLinie(model,anFabricatie,nrLocuri));
        }
        return colectieAutobuzLinie.get(numar);
    }
}
