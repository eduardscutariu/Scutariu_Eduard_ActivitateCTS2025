package adapter.Obiecte.main;

import adapter.Obiecte.clase.CreditLeasingExistent;
import adapter.Obiecte.clase.Adapter;
import adapter.Obiecte.clase.CreditLeasingNou;

public class Main {
    public static void oferaCredit(CreditLeasingExistent creditLeasingExistent){
        creditLeasingExistent.oferaCreditExistent();
    }
    public static void main(String[] args) {
        CreditLeasingExistent creditLeasingExistent=new CreditLeasingExistent(150);
        oferaCredit(creditLeasingExistent);
        CreditLeasingNou creditLeasingNou=new CreditLeasingNou(250);
//        oferaCredit(creditLeasingNou);
        CreditLeasingExistent creditAdaptat = new Adapter(creditLeasingNou);
        oferaCredit(creditAdaptat);

    }
}
