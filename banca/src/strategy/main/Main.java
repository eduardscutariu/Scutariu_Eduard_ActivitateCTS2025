package strategy.main;

import strategy.clase.VerificareActe;
import strategy.clase.VerificarePF;
import strategy.clase.VerificarePJ;

public class Main {
    public static void main(String[] args) {
        VerificareActe verificareActe=new VerificareActe();
        VerificarePF verificarePF=new VerificarePF();
        VerificarePJ verificarePJ=new VerificarePJ();
        verificareActe.setVerificare(verificarePJ);
        verificareActe.verifica();
    }
}
