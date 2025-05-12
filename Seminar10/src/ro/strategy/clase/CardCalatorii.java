package ro.strategy.clase;

public class CardCalatorii implements IMetodaPlata{
    private int nrCalatoriiRamase;

    public CardCalatorii(int nrCalatoriiRamase) {
        this.nrCalatoriiRamase = nrCalatoriiRamase;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatoriiRamase > 0 && nrCalatoriiRamase-pretBilet>=0){
            System.out.println("S-a facut plata cu cardul de calatorii");
            nrCalatoriiRamase -= 1;
        } else {
            System.out.println("Nu mai sunt calatorii");
        }
    }
}
