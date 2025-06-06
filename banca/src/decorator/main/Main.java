package decorator.main;

import decorator.clase.CardBancar;
import decorator.clase.CardBancarNormal;
import decorator.clase.Decorator;
import decorator.clase.DecoratorContactLess;

public class Main {
    public static void main(String[] args) {
        CardBancar card = new CardBancarNormal();
//        card.plateste();
        Decorator decoratorCard= new DecoratorContactLess(card);
        decoratorCard.plateste();
    }
}
