package flyweight.main;

import flyweight.clase.AutobuzLinie;
import flyweight.clase.AutobuzLinieFactory;
import flyweight.clase.IAutobuzLinie;

public class Main {
    public static void main(String[] args) {
        IAutobuzLinie autobuzLinie1= new AutobuzLinie("transporter",2012,20);
//        autobuzLinie1.afisareAutobuzLinie(12,"Cosbuc","Bariera");

        AutobuzLinieFactory fabricaAutobuze=new AutobuzLinieFactory();
        IAutobuzLinie autobuzLinie=fabricaAutobuze.getAutobuzLinie(12,"power",2020,30);

        autobuzLinie.afisareAutobuzLinie(34,"piata","cosbuc");




    }
}
