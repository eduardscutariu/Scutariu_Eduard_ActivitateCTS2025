package facade.clase;

public class Facade {
    public void interneaza(int gravitate){
        Pacient p= new Pacient(gravitate);
        Medic medic=new Medic();
        Salon salon=new Salon();
        if(p.gravitateaStarii()){
            if(medic.trebuieInternat(p)){
                if (salon.patDisponibil(p)){
                    System.out.println("Pacientul poate fi internat!");
                }
                else {
                    System.out.println("Nu avem paturi disponibile");
                }
            }
            else {
                System.out.println("Nu are nevoie de internare");
            }
        }
        else {
            System.out.println("starea nu este grava");
        }
    }
}
