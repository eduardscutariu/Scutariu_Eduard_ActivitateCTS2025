package decorator.clase;

public class Rezultate implements IRezultate{
    private String interpretare;

    public Rezultate(String interpretare) {
        this.interpretare = interpretare;
    }

    @Override
    public void afiseazaRezultate() {
        System.out.println(interpretare);
    }
}
