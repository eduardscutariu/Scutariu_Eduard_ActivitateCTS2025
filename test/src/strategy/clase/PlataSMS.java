package strategy.clase;

public class PlataSMS implements MetodaPlata{
    private int soldSim;

    public PlataSMS(int soldSim) {
        this.soldSim = soldSim;
    }

    @Override
    public void platesteCalatorie() {
        if(soldSim >0){
            System.out.println("Ati platit prin SMS calatoria");
            soldSim--;
        }
        else {
            System.out.println("Nu mai aveti sold pe acest numar de telefon");
        }
    }
}
