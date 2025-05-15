package decorator.main;

import decorator.clase.INota;
import decorator.clase.NotaPlata;
import decorator.clase.NotaDecoratorRevelion;

public class Main {
    public static void main(String[] args) {
        INota notaDePlata= new NotaPlata(100);
        notaDePlata.printeazaNota();
        INota notaDecorata=new NotaDecoratorRevelion(notaDePlata);
        notaDecorata.printeazaNota();


    }
}
