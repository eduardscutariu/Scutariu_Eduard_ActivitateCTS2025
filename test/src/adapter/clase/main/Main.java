package adapter.clase.main;

import adapter.clase.clase.*;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie();
        IMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("paracetamol",20,5);

//        farmacie.farmacieVindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital=new MedicamentSpital("nurofen",25,true);
        AdapterMedicament adapterMedicament=new AdapterMedicament(medicamentSpital.getDenumire(),medicamentSpital.getPret(),medicamentSpital.isInStoc());
        farmacie.farmacieVindeMedicament(adapterMedicament);
        adapterMedicament.vindeMedicamentSpital();

    }

}
