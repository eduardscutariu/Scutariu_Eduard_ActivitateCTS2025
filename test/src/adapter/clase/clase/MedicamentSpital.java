package adapter.clase.clase;

public class MedicamentSpital {
    private String denumire;
    private int pret;
    private boolean inStoc;

    public MedicamentSpital(String denumire, int pret, boolean inStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.inStoc = inStoc;
    }
    public void vindeMedicamentSpital(){
        if(this.inStoc){
            System.out.println("medicamentul "+denumire+" e in stoc, pret: "+pret+", poftiti ,pa!");
        }
        else {
            System.out.println("medicamentul nu e in stoc");
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public boolean isInStoc() {
        return inStoc;
    }
}
