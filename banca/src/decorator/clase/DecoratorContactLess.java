package decorator.clase;

public class DecoratorContactLess extends Decorator{

    public DecoratorContactLess(CardBancar cardDecorat) {
        super(cardDecorat);
    }

    @Override
    public void functieSuplimentare() {
        System.out.println("Acum poti plati si ContactLess");
    }
}
