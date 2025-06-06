package template.clase;

public class RetragereBani extends TemplateRetragere{

    @Override
    public void introducereCard() {
        System.out.println("Introdu card");
    }

    @Override
    public void introducerePin() {
        System.out.println("Introdu pin");
    }

    @Override
    public void solicitaSuma() {
        System.out.println("Introdu suma");
    }

    @Override
    public void retragereSuma() {
        System.out.println("Suma retrasa");
    }

    @Override
    public void retragereCard() {
        System.out.println("Card retras");
    }

}
