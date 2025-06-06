package decorator.clase;

public abstract class Decorator implements IRezultate{
    private IRezultate rezultate;

    public Decorator(IRezultate rezultate) {
        this.rezultate = rezultate;
    }
    public abstract void afiseazaRezultateCustom();

    @Override
    public void afiseazaRezultate() {
        rezultate.afiseazaRezultate();
        afiseazaRezultateCustom();
    }
}
