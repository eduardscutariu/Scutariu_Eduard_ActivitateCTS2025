package facade.clase;

public class Facade extends Autobuz {
    private Autobuz autobuz;

    public Facade(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideToateUsileLiber(){
        autobuz.deschideUsaFataLiber();
        autobuz.deschideUsaMijlocLiber();
        autobuz.deschideUsaSpateLiber();
    }
    public void deschideToateUsileFortat(){
        autobuz.deschideUsaFataFortat();
        autobuz.deschideUsaMijlocFortat();
        autobuz.deschideUsaSpateFortat();
    }
}
