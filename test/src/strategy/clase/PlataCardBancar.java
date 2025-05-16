package strategy.clase;

public class PlataCardBancar implements MetodaPlata{
    private int soldCont;

    public PlataCardBancar(int soldCont) {
        this.soldCont = soldCont;
    }

    @Override
    public void platesteCalatorie() {
        if(soldCont >=5) {
            soldCont-=5;
            System.out.println("Calatorie achitata");
            System.out.println("Sold cont: " + soldCont);
        }
        else{
            System.out.println("Fonduri insuficiente");
        }
    }
}
