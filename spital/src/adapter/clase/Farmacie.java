package adapter.clase;

public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume = nume;
    }

    public void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.vindeMedicamentFarmacie();
    }
}
