package ro.cts.SimpleFactory.Readers;

import ro.cts.SimpleFactory.Agentii.Angajat;
import ro.cts.SimpleFactory.Agentii.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {
    public AngajatReader(String file) {
        super(file);
    }

    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList();

        while (input.hasNext()) {
            Angajat a = new Angajat();
            super.readAplicantData(input, a);
            int salariu = input.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input.close();
        return angajati;
    }
}
