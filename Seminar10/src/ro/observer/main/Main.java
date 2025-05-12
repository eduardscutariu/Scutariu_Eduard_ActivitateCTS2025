package ro.observer.main;

import ro.observer.clase.Autobuz;
import ro.observer.clase.Calator;
import ro.observer.clase.Observabil;
import ro.observer.clase.Observator;

public class Main {
    public static void main(String[] args) {
        Autobuz a1= new Autobuz(100);
        Observator c1= new Calator("andrei");

        a1.abonareObservator(c1);
        a1.pleacaDeLaCapat();
    }
}
