package decorator.clase;

public abstract class DecoratorBilet extends  Printare{
    private Printare biletDecorat;

    public DecoratorBilet(Printare biletDecorat) {
        this.biletDecorat = biletDecorat;
    }

    @Override
    public void printeaza() {
        biletDecorat.printeaza();
    }
}
