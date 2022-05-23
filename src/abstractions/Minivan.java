package abstractions;

public abstract class Minivan extends Car{

    @Override
    public void turnRight() {
        System.out.println("turn right now!");
    }

    public abstract void turnLeft();
}
