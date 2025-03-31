package builderForma1.main;

import builderForma1.clase.Pacient;
import builderForma1.clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder builder=new PacientBuilder("eduard");
        Pacient pacient = builder.setAreHalat(true).setNumeInsotitor("gigel").getPacient();

        System.out.println(pacient);
    }
}
