package ro.cts.SimpleFactory.Readers;

import ro.cts.SimpleFactory.Agentii.Aplicant;
import ro.cts.SimpleFactory.Agentii.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    public ElevReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList();

        while (input.hasNext()) {
            Elev e = new Elev();
            super.readAplicantData(input, e);
            int clasa = input.nextInt();
            String tutore = input.next();
            e.setClasa(clasa);
            e.setTutore(tutore);
            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}
