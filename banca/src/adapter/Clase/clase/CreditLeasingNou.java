package adapter.Clase.clase;

public class CreditLeasingNou {
    private int suma;

    public CreditLeasingNou(int suma) {
        this.suma = suma;
    }

    public int getSuma() {
        return suma;
    }

    public void oferaCreditNou(){

        System.out.println("NOU-Va oferim creditul in valoare de: "+suma);
    }
}
