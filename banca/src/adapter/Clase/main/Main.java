package adapter.Clase.main;

import adapter.Clase.clase.*;

public class Main {
    public static void main(String[] args) {
        ICreditLeasingExistent creditLeasingExistent=new CreditLeasingExistent(1000);
        CreditLeasingNou creditLeasingNou=new CreditLeasingNou(2000);
        OferaCredit oferaCredit=new OferaCredit();
        oferaCredit.oferaCredit(creditLeasingExistent);
//        oferaCredit.oferaCredit(creditLeasingNou);
        ICreditLeasingExistent creditAdaptat= new Adapter(creditLeasingNou);
        oferaCredit.oferaCredit(creditAdaptat);
    }
}
