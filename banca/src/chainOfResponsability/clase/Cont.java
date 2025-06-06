package chainOfResponsability.clase;

public class Cont extends Handler{

    private int nrCont;

    public Cont(int sold,int nrCont) {
        super(sold);
        this.nrCont = nrCont;
    }

    @Override
    public void realizeazaPlata(int suma) {
        if(sold-suma>=0){
            System.out.println("Plata realizata cu succes din contul cu nr: "+this.nrCont);
        }
        else {
            if(next!=null){
                next.realizeazaPlata(suma);
            }
            else
                System.out.println("Nu aveti suma necesara in niciun cont!");
        }
    }
}
