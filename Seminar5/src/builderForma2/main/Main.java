package builderForma2.main;

import builderForma2.clase.Pacient;
import builderForma2.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder builder= new PacientBuilder();
        builder.setArePatRabatabil(true).setAreMicDejun(true);

        Pacient pacient1= builder.setNumeInsotitor("gigel").build("eduard");
        Pacient pacient2= builder.setNumeInsotitor("gita").build("matei");

        System.out.println(pacient1);
        System.out.println(pacient2);

    }
}
