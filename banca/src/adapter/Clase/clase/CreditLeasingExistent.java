package adapter.Clase.clase;

public class CreditLeasingExistent implements ICreditLeasingExistent {
    private int suma;

    public CreditLeasingExistent(int suma) {
        this.suma = suma;
    }

    @Override
    public void oferaCreditExistent(){
        System.out.println("EXISTENT-Va oferim creditul in valoare de: "+suma);
    }

}
