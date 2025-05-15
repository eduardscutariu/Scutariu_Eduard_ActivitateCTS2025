package cts.templateMethod.clase;

public class MetrouSpecial extends TemplateMetrou {
    @Override
    public void opresteStatia1() {
        System.out.println("Am oprit in statia 1");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Nu putem opri in statia 2");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Am oprit in statia 3");
    }
}
