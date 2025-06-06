package decorator.clase;

public abstract class Decorator implements CardBancar{
    private CardBancar cardDecorat;

    public Decorator(CardBancar cardDecorat) {
        this.cardDecorat = cardDecorat;
    }
    public abstract void functieSuplimentare();
    @Override
    public void plateste() {
        cardDecorat.plateste();
        functieSuplimentare();
    }
}
