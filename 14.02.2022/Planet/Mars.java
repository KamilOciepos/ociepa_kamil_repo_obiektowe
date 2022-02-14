package Planet;

public class Mars implements PlanetyImp {
    @Override
    public boolean checkAtmosphere() {
        return true;
    }

    public boolean checkLife() {
        return false;
    }
}
