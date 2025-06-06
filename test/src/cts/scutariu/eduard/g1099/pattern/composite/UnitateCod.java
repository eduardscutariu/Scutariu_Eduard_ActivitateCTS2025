package cts.scutariu.eduard.g1099.pattern.composite;

public class UnitateCod extends StructuraArborescenta{
    private String cod;

    public UnitateCod(String cod) {
        this.cod = cod;
    }

    @Override
    public void addNod(Code nod) {
        throw new UnsupportedOperationException("frunza");
    }

    @Override
    public void deleteNod(Code nod) {
        throw new UnsupportedOperationException("frunza");
    }

    @Override
    public Code getNod(int index) {
        throw new UnsupportedOperationException("frunza");
    }

    @Override
    public void verifica() {
        System.out.println("Cod: " + cod);
        super.verifica();
    }
}
