package decorator.clase;

public class DecoratorRezultateOnline extends Decorator{

    public DecoratorRezultateOnline(IRezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void afiseazaRezultateCustom() {
        System.out.println("ati primit rezultatele si pe mail!");
    }

}
