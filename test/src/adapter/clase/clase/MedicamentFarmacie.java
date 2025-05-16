package adapter.clase.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String denumire;
    private int pret;
    private int nrBucStoc;

    public MedicamentFarmacie(String denumire, int pret, int nrBucStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.nrBucStoc = nrBucStoc;
    }

    @Override
    public void farmacieVindeMedicament() {
        if(nrBucStoc >0){
            System.out.println("medicamentul "+denumire+" e in stoc, pret: "+pret+", poftiti!");
            nrBucStoc--;
        }
        else {
            System.out.println("Medicamentul " + denumire + " nu se afla momentan in stocul farmaciei!");
        }
    }
}
