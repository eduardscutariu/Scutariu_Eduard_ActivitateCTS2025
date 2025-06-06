package flyweight.clase;

public class DetaliiCont {
    private int nr;
    private int sold;

    public DetaliiCont(int nr, int sold) {
        this.nr = nr;
        this.sold = sold;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DetaliiCont{");
        sb.append("nr=").append(nr);
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}
