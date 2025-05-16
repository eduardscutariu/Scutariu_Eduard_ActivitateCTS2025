package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.InterfataAutobuz;
import proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        InterfataAutobuz autobuz=new Autobuz();
        Proxy proxy=new Proxy(autobuz);
        proxy.opresteInStatie(0);
        autobuz.opresteInStatie(0);
    }
}
