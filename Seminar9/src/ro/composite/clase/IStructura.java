package ro.composite.clase;

public interface IStructura {
    void descriereStructura();
    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNodCopil(int index) throws Exception;
}
