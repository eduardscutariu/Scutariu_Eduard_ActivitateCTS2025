package ro.cts.proxy.main;

import ro.cts.proxy.clase.IRezervare;
import ro.cts.proxy.clase.ProxyNumarPersoane;
import ro.cts.proxy.clase.ProxyOra;
import ro.cts.proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare= new Rezervare();
        rezervare.rezerva("Gigel",5,15);

        IRezervare proxyNumarPersoane= new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezerva("Gigu",3,12);

        IRezervare proxyOra= new ProxyOra(proxyNumarPersoane);
        proxyOra.rezerva("Popescu",6,18);
    }
}
