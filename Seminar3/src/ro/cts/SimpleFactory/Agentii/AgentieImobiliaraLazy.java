package ro.cts.SimpleFactory.Agentii;

public class AgentieImobiliaraLazy {
    private String nume;
    private int nrAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliaraLazy = null;

    private AgentieImobiliaraLazy(String nume, int nrAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.nrAnunturi = nrAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public synchronized static AgentieImobiliaraLazy getInstanceLazy(String nume, int nrAnunturi, String site, float cifraAfaceri){
        if(agentieImobiliaraLazy==null){// la eager nu apare problema de threading
            agentieImobiliaraLazy= new AgentieImobiliaraLazy(nume,nrAnunturi,site,cifraAfaceri);
        }
        return agentieImobiliaraLazy;
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
        final StringBuilder sb = new StringBuilder("AgentieImobiliaraLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAnunturi=").append(nrAnunturi);
        sb.append(", site='").append(site).append('\'');
        sb.append(", cifraAfaceri=").append(cifraAfaceri);
        sb.append('}');
        return sb.toString();
    }


}

