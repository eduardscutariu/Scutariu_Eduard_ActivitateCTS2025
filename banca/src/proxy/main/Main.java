package proxy.main;

import proxy.clase.Banca;
import proxy.clase.IBanca;
import proxy.clase.Proxy;

public class Main {
    public static void main(String[] args) {
        IBanca banca= new Banca();
        banca.deschideCont("EUR");
        IBanca proxy= new Proxy(banca);
        proxy.deschideCont("RON");
    }
}
