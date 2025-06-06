package facade.clase;

public class Pacient {
    private int gravitateaStarii;

    public Pacient(int gravitateaStarii) {
        this.gravitateaStarii = gravitateaStarii;
    }

    public int getGravitateaStarii() {
        return gravitateaStarii;
    }

    public boolean gravitateaStarii(){
        if(gravitateaStarii>=5)
            return true;
        else
            return false;
    }
}
