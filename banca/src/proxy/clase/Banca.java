package proxy.clase;

public class Banca implements IBanca{

    @Override
    public void deschideCont(String moneda) {
        System.out.println("S a deschis cont in: "+moneda);
    }
}
