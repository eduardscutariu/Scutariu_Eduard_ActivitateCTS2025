package adapter.Clase.clase;

public class Adapter extends CreditLeasingNou implements ICreditLeasingExistent{

    public Adapter(CreditLeasingNou creditLeasingNou) {
        super(creditLeasingNou.getSuma());
    }

    @Override
    public void oferaCreditExistent() {
        super.oferaCreditNou();
    }
}
