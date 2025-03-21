package ro.cts.SimpleFactory.Readers;

import ro.cts.SimpleFactory.Agentii.Aplicant;
import ro.cts.SimpleFactory.Agentii.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String file) {
        super(file);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList();

        while (input.hasNext()) {
            Student s = new Student();
            super.readAplicantData(input, s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setAnStudii(an_studii);
            s.setFacultate(facultate);
           studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
