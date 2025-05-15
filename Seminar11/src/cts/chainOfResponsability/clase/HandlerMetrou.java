package cts.chainOfResponsability.clase;

public class HandlerMetrou extends Handler{

    @Override
    public void recomanda(int distanta) {
        if(distanta>10){
            System.out.println("Va recomand sa luati metroul!");
        }
        else {
            next.recomanda(distanta);
        }
    }
}
