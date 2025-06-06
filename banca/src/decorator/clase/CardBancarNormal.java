package decorator.clase;

public class CardBancarNormal implements CardBancar{

    @Override
    public void plateste() {
        System.out.println("Poti plati online sau plati normale cu cardul!");
    }
}
