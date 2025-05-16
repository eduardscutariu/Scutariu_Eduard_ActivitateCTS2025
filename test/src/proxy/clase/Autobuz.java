package proxy.clase;

public class Autobuz implements InterfataAutobuz{

    @Override
    public void opresteInStatie(int nrPersoane) {
        System.out.println("Autobuzul va opri in statie, sunt "+nrPersoane+" persoane!");
    }
}
