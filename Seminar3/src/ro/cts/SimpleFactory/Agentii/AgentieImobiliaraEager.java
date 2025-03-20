package ro.cts.SimpleFactory.Agentii;

public class AgentieImobiliaraEager {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraEager agentieImobiliaraEager = new AgentieImobiliaraEager("agentiaRomana",10,"www.agentie.ro",230000.5f);

    private AgentieImobiliaraEager(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraEager getInstanceEager(){
        return agentieImobiliaraEager;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void posteazaAnunturi(String anunt){
        this.nrAnunturi++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }


}
