package decorator.clase;

public abstract class NotaDecorator implements INota {
    private INota produsDecorat;

    public NotaDecorator(INota produsDecorat) {
        this.produsDecorat = produsDecorat;
    }
    protected abstract void printeazaFelicitare();

    @Override
    public void printeazaNota() {
        produsDecorat.printeazaNota();
        this.printeazaFelicitare();
    }
}
