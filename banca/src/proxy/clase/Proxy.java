package proxy.clase;

public class Proxy implements IBanca{
    private IBanca proxy;

    public Proxy(IBanca proxy) {
        this.proxy = proxy;
    }

    @Override
    public void deschideCont(String moneda) {
        if(moneda.equals("RON")){
            proxy.deschideCont(moneda);
        }
        else {
            System.out.println("Puteti deschide cont doar in RON");
        }
    }
}
