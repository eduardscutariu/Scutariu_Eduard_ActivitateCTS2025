package adapter.clase;

public class MedicamentSpital {
    private String nume;

    public MedicamentSpital(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }
    public void vindeMedicamentSpital() {
        System.out.println("Medicament spital vandut:" + nume);
    }
}
