package strategy.clase;

public class VerificareActe {
    private IVerificare verificare;


    public void setVerificare(IVerificare verificare) {
        this.verificare = verificare;
    }
    public void verifica() {
        verificare.verificare();
    }
}
