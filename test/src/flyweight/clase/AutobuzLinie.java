package flyweight.clase;

public class AutobuzLinie implements IAutobuzLinie{
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public AutobuzLinie(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }



    @Override
    public void afisareAutobuzLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        System.out.println(this.toString());
        System.out.print("nrLinie=" + nrLinie);
        System.out.print(" primaStatie=" + primaStatie);
        System.out.println(" ultimaStatie=" + ultimaStatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
