package abstractions;

public class Express {
    public static void main(String[] args) {
        Minivan minivan = new Minivan() {
            @Override
            public void turnLeft() {
                System.out.println("Turn fricking left now!");
            }
        };
    }
}
