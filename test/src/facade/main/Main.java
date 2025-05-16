package facade.main;

import adapter.clase.clase.AdapterMedicament;
import facade.clase.Autobuz;
import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade facade=new Facade(autobuz);
        facade.deschideToateUsileLiber();
    }

}
