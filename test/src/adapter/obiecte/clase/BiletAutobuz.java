package adapter.obiecte.clase;

public class BiletAutobuz {
    protected int nrCalatorii;

    public BiletAutobuz(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public void platesteCalatorie(){
        if(this.nrCalatorii>0){
            this.nrCalatorii--;
            System.out.println("Calatorie achitata");
        }
        else{
            System.out.println("Nu mai aveti calatorii disponibile");
        }
    }
}
