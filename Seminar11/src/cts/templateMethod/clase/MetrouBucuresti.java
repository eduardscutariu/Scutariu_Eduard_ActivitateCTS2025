package cts.templateMethod.clase;

public class MetrouBucuresti extends TemplateMetrou{

    private int nrMetrou;

    public MetrouBucuresti(int nrMetrou) {
        this.nrMetrou = nrMetrou;
    }

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul "+nrMetrou+"a oprit in statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul "+nrMetrou+"a oprit in statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul "+nrMetrou+"a oprit in statia 3");
    }
}
