package adapter.clase.clase;

public class AdapterMedicament extends MedicamentSpital implements IMedicamentFarmacie{

    public AdapterMedicament(String denumire, int pret, boolean inStoc) {
        super(denumire, pret, inStoc);
    }

    @Override
    public void farmacieVindeMedicament() {
        super.vindeMedicamentSpital();
    }
}
