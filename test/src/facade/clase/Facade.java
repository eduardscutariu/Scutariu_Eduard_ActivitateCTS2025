package facade.clase;

public class Facade {
    public String verificaMasa(Masa masa){
        if(masa.isLibera()){
            Debarasata debarasata=new Debarasata();
            if(debarasata.esteDebarasata(masa)){
                Aranjata aranjata=new Aranjata();
                if(aranjata.esteAranjata(masa)){
                    return ("Va putem rezerva masa");
                }
                else {
                    return("nu este aranjata");
                }
            }
            else {
                return("nu este debarasata");
            }
        }
        else {
            return("nu este libera");
        }
    }
}
