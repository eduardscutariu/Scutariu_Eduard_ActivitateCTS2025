package decorator.clase;

public class PrintareBilet extends Printare{
    private String denumireEveniment;
    private int nrBilet;

    public PrintareBilet(String denumireEveniment) {
        this.denumireEveniment = denumireEveniment;
        this.nrBilet = 1;
    }

    @Override
    public void printeaza() {
        System.out.println("Printam biletul cu nr "+this.nrBilet+" pentru evenimentul "+this.denumireEveniment);
        nrBilet++;
    }
}
