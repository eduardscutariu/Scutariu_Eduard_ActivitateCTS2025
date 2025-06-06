package adapter.Obiecte.clase;


public class CreditLeasingExistent{
    private int suma;

    public CreditLeasingExistent(int suma) {
        this.suma = suma;
    }

    public void oferaCreditExistent(){
        System.out.println("EXISTENT-Va oferim creditul in valoare de: "+suma);
    }

}
