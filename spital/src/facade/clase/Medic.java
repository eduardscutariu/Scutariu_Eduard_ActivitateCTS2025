package facade.clase;

public class Medic {
    public boolean trebuieInternat(Pacient p){
        return p.getGravitateaStarii() % 2 == 0;
    }
}
