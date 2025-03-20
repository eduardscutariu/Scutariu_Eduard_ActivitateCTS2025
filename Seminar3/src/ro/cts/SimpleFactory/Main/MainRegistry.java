package ro.cts.SimpleFactory.Main;


import ro.cts.SimpleFactory.Anunturi.AgentieImobiliara;
import ro.cts.SimpleFactory.Anunturi.Anunt;

public class MainRegistry {

    public static void main(String[] args) {
        AgentieImobiliara agentieImobiliara= new AgentieImobiliara("homz",1000000);
        Anunt anunt1= agentieImobiliara.getAnunt("piata romana nr 6","gigel",2);
        Anunt anunt2= agentieImobiliara.getAnunt("piata victoriei nr 10","florin",4);
        Anunt anunt3= agentieImobiliara.getAnunt("piata romana nr 6","vasilescu",2);

        System.out.println(anunt3);


    }
}
