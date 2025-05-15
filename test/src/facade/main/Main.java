package facade.main;

import facade.clase.Facade;
import facade.clase.Masa;

import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(4,true);
        Facade facade= new Facade();
        System.out.println(facade.verificaMasa(masa1));
    }
}
