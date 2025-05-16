package composite.clase;

public class Autobuz implements StructuraArborescenta{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descrieStructura() {
        throw new UnsupportedOperationException("este frunza");
    }

    @Override
    public void adaugaNod(StructuraArborescenta s) {
        throw new UnsupportedOperationException("este frunza");
    }

    @Override
    public void stergeNod(StructuraArborescenta s) {
        throw new UnsupportedOperationException("este frunza");
    }

    @Override
    public void getNodCopil(int index) {
        throw new UnsupportedOperationException("este frunza");
    }
}
