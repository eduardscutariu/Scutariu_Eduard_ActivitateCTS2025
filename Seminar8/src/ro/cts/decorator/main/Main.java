package ro.cts.decorator.main;

import ro.cts.decorator.clase.Nota;
import ro.cts.decorator.clase.NotaDePlata;
import ro.cts.decorator.clase.NotaDePlataCraciun;
import ro.cts.decorator.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {
        Nota nota1=new NotaDePlata(100.5f);
        nota1.printare();
        Nota notaDecorataRevelion=new NotaDePlataRevelion(nota1);
        notaDecorataRevelion.printare();

        Nota notaDecorataCraciun=new NotaDePlataCraciun(nota1);
        Nota nota2=new NotaDePlataCraciun(notaDecorataRevelion);
        nota2.printare();
        notaDecorataCraciun.printare();
    }
}
