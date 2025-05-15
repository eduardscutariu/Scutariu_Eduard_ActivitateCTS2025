package decorator.clase;

public class NotaDecoratorRevelion extends NotaDecorator {

    public NotaDecoratorRevelion(INota produsDecorat) {
        super(produsDecorat);
    }

    @Override
    protected void printeazaFelicitare() {
        System.out.println("La multi ani!");
    }
}
