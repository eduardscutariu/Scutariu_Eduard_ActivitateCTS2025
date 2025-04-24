package ro.cts.facade.main;

import ro.cts.facade.clase.Masa;
import ro.cts.facade.clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(true,20,4);
        Receptionist receptionist=new Receptionist();

        System.out.println(receptionist.poateLuaLocLaMasa(masa1));

        Masa masa2=new Masa(true,23,5);
        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

        Masa masa3=new Masa(true,4,2);
        System.out.println(receptionist.poateLuaLocLaMasa(masa3));
    }
}
