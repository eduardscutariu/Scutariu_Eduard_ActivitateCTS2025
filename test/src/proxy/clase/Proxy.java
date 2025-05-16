package proxy.clase;

public class Proxy implements InterfataAutobuz{
    private InterfataAutobuz autobuz;

    public Proxy(InterfataAutobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie(int nrPersoane) {
        if(nrPersoane!=0){
            autobuz.opresteInStatie(nrPersoane);
        }
        else {
            System.out.println("Autobuzul se retrage nu exista persoane!");
        }
    }
}
