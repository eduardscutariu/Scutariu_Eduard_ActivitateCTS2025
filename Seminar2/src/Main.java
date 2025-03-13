import ro.cts.Agentii.Aplicant;
import ro.cts.Readers.AngajatReader;
import ro.cts.Readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AplicantReader aplicantReader = new AngajatReader("angajati.txt");
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = aplicantReader.readAplicanti();
            for(Aplicant aplicant:listaAplicanti)
                System.out.println(aplicant.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
