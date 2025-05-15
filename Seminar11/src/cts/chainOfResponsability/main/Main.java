package cts.chainOfResponsability.main;

import cts.chainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        Handler hTroleibuz=new HandlerTroleibuz();

        Handler hAutobuz=new HandlerAutobuz();
        hTroleibuz.setNext(hAutobuz);
        Handler hTramvai=new HandlerTramvai();
        hAutobuz.setNext(hTramvai);
        Handler hMetrou=new HandlerMetrou();
        hTramvai.setNext(hMetrou);

        hTroleibuz.recomanda(2);
        hTroleibuz.recomanda(5);
        hTroleibuz.recomanda(7);
        hTroleibuz.recomanda(12);
    }
}
