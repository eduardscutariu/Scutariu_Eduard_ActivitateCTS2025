package strategy.clase;

public class Calator {
    private String nume;
    private MetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata = null;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata){
        this.metodaPlata = metodaPlata;
    }

    public void platesteCalatorie(){
        metodaPlata.platesteCalatorie();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Calator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", metodaPlata=").append(metodaPlata);
        sb.append('}');
        return sb.toString();
    }
}
