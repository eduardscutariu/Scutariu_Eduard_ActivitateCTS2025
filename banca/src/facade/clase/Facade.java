package facade.clase;

public class Facade {
    Operator operator=new Operator();
    public void creazaCont(int varsta,int cazier){
        if(operator.verificaVarsta(varsta)){
            if(operator.verificaCazier(cazier)){
                System.out.println("Cont deschis cu succes!");
            }
            else System.out.println("cazier neconform!");
        }
        else System.out.println("este minor");
    }

}
