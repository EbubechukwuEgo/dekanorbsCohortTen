package tddClass;

public class AirConditioner {

    private int bump;


    public boolean turnedOn() {

        return true;
    }

    public boolean turnedOff() {

        return false;
    }

    public int increase(int initialTemp, int finalTemp) {
        bump = finalTemp - initialTemp;
        return bump;
    }

    public int decrease(int finalTemp, int initialTemp) {
        bump = initialTemp - finalTemp;
        return bump;
    }
}
