package ro.cts.Prototype.Rezervare;

public class Rezervare extends ARezervare{
    protected Boolean isInterior;

    public Rezervare() {
        super();
        isInterior=true;
    }

    public Rezervare(String nume, int ora, int nrPersoane, int zi, Boolean isInterior) {
        super(nume, ora, nrPersoane, zi);
        this.isInterior = isInterior;
    }

    @Override
    public ARezervare clonareRezervare(int zi) {
        Rezervare r =  new Rezervare();
        r.isInterior=this.isInterior;
        r.nume=this.nume;
        r.ora=this.ora;
        r.nrPersoane=this.nrPersoane;
        if(1<zi && zi<31){
            r.zi=zi;
        }
        else{
            r.zi=this.zi;
        }
        r.zi=this.zi;
        return r;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("isInterior=").append(isInterior);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", zi=").append(zi);
        sb.append('}');
        return sb.toString();
    }
}
