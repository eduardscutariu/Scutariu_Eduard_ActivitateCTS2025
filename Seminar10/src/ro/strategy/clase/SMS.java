package ro.strategy.clase;

public class SMS implements IMetodaPlata{
    public SMS() {

    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("S-a platit prin SMS");
    }
}
