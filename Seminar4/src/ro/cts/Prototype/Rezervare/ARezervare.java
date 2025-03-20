package ro.cts.Prototype.Rezervare;

public abstract class ARezervare {
    protected String nume;
    protected int ora;
    protected int nrPersoane;
    protected int zi;

    protected ARezervare(String nume, int ora, int nrPersoane, int zi) {
        if(nume.length()<3)
        {
            this.nume = "client";
        }
        else{
            this.nume = nume;
        }
        if(ora>10 && ora <22){
            this.ora = ora;
        }
        else{
            this.ora = 10;
        }
        this.nrPersoane = nrPersoane;
        if(zi>1 && zi <31){
            this.zi = zi;
        }
        else{
            this.zi = 1;
        }
    }

    public ARezervare() {
        this.nume = "numeClient";
        this.ora = 10;
        this.nrPersoane = 10;
        this.zi = 1;
    }

    public abstract ARezervare clonareRezervare(int zi);
}
