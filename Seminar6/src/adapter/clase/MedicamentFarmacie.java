package adapter.clase;

public class MedicamentFarmacie {
    private String nume;
    private int pret;
    private boolean inStoc;
    private String dataExpirarii;

    public void cumparaMedicament(){
        System.out.println("Medicament: " + this.nume + " la pretul " + this.pret + " ,stoc:" + this.inStoc);
    }

    public MedicamentFarmacie(String nume, int pret, boolean inStoc, String dataExpirarii) {
        this.nume = nume;
        this.pret = pret;
        this.inStoc = inStoc;
        this.dataExpirarii = dataExpirarii;
    }
}
