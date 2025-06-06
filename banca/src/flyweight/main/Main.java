package flyweight.main;

import flyweight.clase.Client;
import flyweight.clase.ClientFactory;
import flyweight.clase.DetaliiCont;
import flyweight.clase.IClient;

public class Main {

    public static void main(String[] args) {
        ClientFactory clientFactory=new ClientFactory();
//        IClient client1= clientFactory.getClient("eduard");
        IClient client2= clientFactory.getClient("eduard","obor");
        DetaliiCont detaliiCont1=new DetaliiCont(1,350);
        DetaliiCont detaliiCont2=new DetaliiCont(2,3455550);
        client2.afiseazaCont(detaliiCont1);
        IClient eduard=clientFactory.getClient("eduard");
        eduard.afiseazaCont(detaliiCont2);

    }
}
