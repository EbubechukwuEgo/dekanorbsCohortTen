package exceptions;

public class Beans {
    private int noOfSpoons;
    private boolean boston;

    public Beans(int amount, boolean boston) {
        this.boston = boston;
        noOfSpoons = amount/50;
    }


    public  String toString(){
        return String.format("%d spoons of beans %s", noOfSpoons, boston? ", with some Boston beans.": ".");
    }
}
