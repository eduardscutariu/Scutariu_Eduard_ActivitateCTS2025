package decorator.main;

import decorator.clase.DecoratorBilet;
import decorator.clase.DecoratorBiletNational;
import decorator.clase.Printare;
import decorator.clase.PrintareBilet;

public class Main {
    public static void main(String[] args) {
        Printare bilet=new PrintareBilet("neversea");
        bilet.printeaza();
        Printare biletNational=new DecoratorBiletNational(bilet,"La multi ani!");
        biletNational.printeaza();
    }
}
