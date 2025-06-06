package chainOfResponsability.main;

import chainOfResponsability.clase.Cont;
import chainOfResponsability.clase.Handler;

public class Main {
    public static void main(String[] args) {
        Handler cont1=new Cont(100,1);
        Handler cont2=new Cont(200,2);
        Handler cont3=new Cont(300,3);

        cont1.setNext(cont2);
        cont2.setNext(cont3);

        cont1.realizeazaPlata(301);
    }
}
