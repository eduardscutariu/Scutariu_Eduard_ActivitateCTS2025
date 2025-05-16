package adapter.obiecte.clase;

public class Adapter extends BiletMetrou {
    private BiletAutobuz biletAutobuz;

    public Adapter(BiletAutobuz biletAutobuz) {
        super(biletAutobuz.nrCalatorii);
        this.biletAutobuz=new BiletAutobuz(biletAutobuz.nrCalatorii);
    }

    @Override
    public void platesteCalatorie() {
        this.biletAutobuz.platesteCalatorie();
    }
}
