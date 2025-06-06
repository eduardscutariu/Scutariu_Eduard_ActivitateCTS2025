package template.clase;

public abstract class TemplateRetragere {
    public final void retrage(){
        introducereCard();
        introducerePin();
        solicitaSuma();
        retragereSuma();
        retragereCard();
    }
    public abstract void introducereCard();
    public abstract void introducerePin();
    public abstract void solicitaSuma();
    public abstract void retragereSuma();
    public abstract void retragereCard();
}
