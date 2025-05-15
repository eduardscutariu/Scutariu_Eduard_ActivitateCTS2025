package cts.templateMethod.main;

import cts.templateMethod.clase.MetrouBucuresti;
import cts.templateMethod.clase.MetrouSpecial;
import cts.templateMethod.clase.TemplateMetrou;

public class Main {
    public static void main(String[] args) {
        TemplateMetrou m1=new MetrouBucuresti(5);
        m1.circulaTur();

        TemplateMetrou m2=new MetrouSpecial();
        m2.circulaTur();

    }
}
