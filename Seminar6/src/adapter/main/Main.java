package adapter.main;

import adapter.adaptor.AdaptorMedicament;
import adapter.clase.MedicamentFarmacie;
import adapter.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie= new MedicamentFarmacie("nurofen",10,true,"05/08/2025");
        vindeMedicament(medicamentFarmacie);
        MedicamentSpital medicamentSpital=new MedicamentSpital("paracetamol",5);
//        vindeMedicament(medicamentSpital); aici intervine rolul adaptorului
        AdaptorMedicament adaptor=new AdaptorMedicament(medicamentSpital);

        vindeMedicament(adaptor);



        adaptor.cumparaMedicament();
    }
}
