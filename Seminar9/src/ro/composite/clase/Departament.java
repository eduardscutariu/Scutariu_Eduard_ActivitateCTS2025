package ro.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    String nume;
    List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista= new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departament: " + nume+" are urmatoarele subdepartamente/sectii: ");
        for(IStructura structura:lista){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        lista.remove(structura);
    }


    @Override
    public IStructura getNodCopil(int index) {
        return lista.get(index);
    }
}
