package cts.templateMethod.clase;

public abstract class TemplateMetrou {
    public final void circulaTur(){
        opresteStatia1();
        opresteStatia2();
        opresteStatia3();
    }
    public final void circulaRetur(){
        opresteStatia3();
        opresteStatia2();
        opresteStatia1();
    }
    protected abstract void opresteStatia1();
    protected abstract void opresteStatia2();
    protected abstract void opresteStatia3();
}
