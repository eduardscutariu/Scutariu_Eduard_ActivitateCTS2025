package adapter.adaptor;

import adapter.clase.MedicamentFarmacie;
import adapter.clase.MedicamentSpital;

public class AdaptorMedicament extends MedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), true, "03/04/2025");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
