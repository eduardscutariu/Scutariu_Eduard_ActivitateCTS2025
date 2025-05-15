package proxy.main;

import proxy.clase.InterfataRezervare;
import proxy.clase.Proxy;
import proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        InterfataRezervare rezervare= new Rezervare();
//        rezervare.rezerva(1);//permite orice

        InterfataRezervare proxy= new Proxy(rezervare);
        proxy.rezerva(2);
    }
}
