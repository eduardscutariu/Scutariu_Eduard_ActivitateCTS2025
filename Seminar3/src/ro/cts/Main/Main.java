package ro.cts.Main;


import ro.cts.Agentii.AgentieImobiliaraEager;
import ro.cts.Agentii.AgentieImobiliaraLazy;

public class Main {

    public static void main(String[] args) {

        AgentieImobiliaraEager agentie= AgentieImobiliaraEager.getInstanceEager();
//        System.out.println(agentie.toString());

        AgentieImobiliaraEager agentie2= AgentieImobiliaraEager.getInstanceEager();
        agentie.setSite("www.test.ro");
        agentie.posteazaAnunturi("anunt imobil 1");
        agentie2.posteazaAnunturi("anunt imobil 2");
//        System.out.println(agentie2.toString());

        AgentieImobiliaraLazy agentie3= AgentieImobiliaraLazy.getInstanceLazy("agentiaLazy1",20,"www.lazy1.ro",43000.2f);
        System.out.println(agentie3.toString());
        AgentieImobiliaraLazy agentie4= AgentieImobiliaraLazy.getInstanceLazy("agentiaLazy2",25,"www.lazy2.ro",49000.2f);
        System.out.println(agentie4.toString());



    }
}
