package adapter.clase;

public class MedicamentFarmacie {
    private String nume;

    public MedicamentFarmacie(String nume) {
        this.nume = nume;
    }



    public void vindeMedicamentFarmacie() {
        System.out.println("Medicament farmacie vandut: " + nume);
    }
}
