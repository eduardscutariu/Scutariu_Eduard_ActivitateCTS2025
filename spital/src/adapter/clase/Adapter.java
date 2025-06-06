package adapter.clase;

public class Adapter extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public Adapter(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void vindeMedicamentFarmacie() {
        medicamentSpital.vindeMedicamentSpital();
    }
}
