package tddClass;

public class TelevisionSet {


    private int change;

    public boolean isOn() {
        return true;
    }

    public int volumeChange(int initialVol, int finalVol) {
        change = finalVol - initialVol;
        return change;
    }

    public boolean channelChange() {
        return false;
    }
}
