package Planet;

public class Wenus implements PlanetyImp {
    @Override
    public boolean checkAtmosphere() {
        return true;
    }

    public boolean checkLife() {
        return false;
    }
}
