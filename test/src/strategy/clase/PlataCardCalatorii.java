package strategy.clase;

public class PlataCardCalatorii implements MetodaPlata {
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void platesteCalatorie() {
        if (this.nrCalatorii >0) {
            System.out.println("Calatorie platita");
            this.nrCalatorii--;
        }
        else {
            System.out.println("Nu mai aveti suficiente calatorii");
        }
    }
}
