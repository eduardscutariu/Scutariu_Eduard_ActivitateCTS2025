package adapter.clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Este achizitionat medicamentul: " + nume + ", pret: " + pret);

    }
    public void prezintaReteta(){
        System.out.println("A fost prezentata reteta");
    }

    public MedicamentSpital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public int getPret() {
        return pret;
    }
}
