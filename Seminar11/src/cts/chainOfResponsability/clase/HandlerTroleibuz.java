package cts.chainOfResponsability.clase;

public class HandlerTroleibuz extends Handler{
    @Override
    public void recomanda(int distanta) {
        if(distanta<3){
            System .out.println("Va recomand sa luati troleibuzul");
        }
        else {
            next.recomanda(distanta);
        }
    }
}
