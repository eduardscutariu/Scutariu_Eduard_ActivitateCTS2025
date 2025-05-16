package decorator.clase;

public class DecoratorBiletNational extends DecoratorBilet{
    private String mesajNational;

    public DecoratorBiletNational(Printare biletDecorat, String mesajNational) {
        super(biletDecorat);
        this.mesajNational = mesajNational;
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println(mesajNational);
    }
}
