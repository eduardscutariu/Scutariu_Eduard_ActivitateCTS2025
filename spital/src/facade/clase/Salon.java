package facade.clase;

public class Salon {
    public boolean patDisponibil(Pacient p){
        return p.getGravitateaStarii()%4==0;
    }
}
