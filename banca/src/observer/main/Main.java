package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.Observabil;
import observer.clase.Observator;

public class Main {
    public static void main(String[] args) {
        Observabil banca= new Banca("bcr");
        Observator client1=new Client("eduard");
        Observator client2=new Client("andrei");
        Observator client3=new Client("mihai");

        banca.addObservator(client1);
        banca.addObservator(client2);
        banca.addObservator(client3);

        banca.notificaObservatori("Dobanda la promotie!\n");
    }
}
