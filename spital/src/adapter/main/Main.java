package adapter.main;

import adapter.clase.Adapter;
import adapter.clase.Farmacie;
import adapter.clase.MedicamentFarmacie;
import adapter.clase.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie=new Farmacie("catena");
        MedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("paracetamol");
        farmacie.vindeMedicament(medicamentFarmacie);
        MedicamentSpital medicamentSpital=new MedicamentSpital("nurofen");
//        farmacie.vindeMedicament(medicamentSpital);
        MedicamentFarmacie medicamentAdaptat=new Adapter(medicamentSpital);
        farmacie.vindeMedicament(medicamentAdaptat);
    }
}
