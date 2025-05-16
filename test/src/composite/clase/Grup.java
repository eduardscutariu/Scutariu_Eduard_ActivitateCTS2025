package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements StructuraArborescenta{
    private String denumireGrup;
    private List<StructuraArborescenta> listaAutobuze;

    public Grup(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        this.listaAutobuze = new ArrayList<>();
    }

    public String getDenumireGrup() {
        return denumireGrup;
    }

    @Override
    public void descrieStructura() {
        System.out.println("Grup: "+denumireGrup);
        for (StructuraArborescenta autobuz : listaAutobuze){
            System.out.println(autobuz.toString());
        }
    }

    @Override
    public void adaugaNod(StructuraArborescenta a) {
        listaAutobuze.add(a);
    }

    @Override
    public void stergeNod(StructuraArborescenta a) {
        listaAutobuze.remove(a);
    }

    @Override
    public void getNodCopil(int index) {
        listaAutobuze.get(index);
    }
}
