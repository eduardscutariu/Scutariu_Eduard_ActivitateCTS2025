package chainOfResponsability.clase;

public abstract class Handler {
    protected Handler next;
    protected int sold;

    public Handler( int sold) {
        this.sold = sold;
        this.next = null;
    }

        public void setNext(Handler next) {
        this.next = next;
    }
    public abstract void realizeazaPlata(int suma);
}
