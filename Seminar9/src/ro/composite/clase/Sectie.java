package ro.composite.clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectie " + nume);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception("Nu are implementare aceasta functie");
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception("Nu are implementare aceasta functie");
    }

    @Override
    public IStructura getNodCopil(int index) throws Exception {
        throw new Exception("Nu are implementare aceasta functie");
    }
}
