package decorator.clase;

public class NotaPlata implements INota {
    private int pret;

    public NotaPlata(int pret) {
        this.pret = pret;
    }

    @Override
    public void printeazaNota() {
        System.out.println("aveti de plata: "+pret);
    }
}
