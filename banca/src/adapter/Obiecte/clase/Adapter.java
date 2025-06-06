package adapter.Obiecte.clase;

public class Adapter extends CreditLeasingExistent{
    private CreditLeasingNou creditLeasingNou;

    public Adapter(CreditLeasingNou creditLeasingNou) {
        super(creditLeasingNou.getSuma());
        this.creditLeasingNou = creditLeasingNou;
    }

    @Override
    public void oferaCreditExistent() {
        creditLeasingNou.oferaCreditNou();
    }
}
