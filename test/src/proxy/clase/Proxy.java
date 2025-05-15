package proxy.clase;

public class Proxy implements InterfataRezervare{
    private InterfataRezervare rezervare;

    public Proxy(InterfataRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(int nrPersoane) {
        if (nrPersoane>=4) {
            rezervare.rezerva(nrPersoane);
        }
        else if(nrPersoane==2){

            rezervare.rezerva(nrPersoane);
        }
        else {
            System.out.println("Nu va putem face rezervare");
        }

    }
}
