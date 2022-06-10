package exceptions;

public class Messenger {

    public Beans buyBeans(int amount, boolean boston, boolean isFake){
        return sendSomeBodyElse(amount, boston, isFake);
    }

    private Beans sendSomeBodyElse(int amount, boolean boston, boolean isFake) {
        if (isFake) throw new IllegalArgumentException("Your Money is Counterfeit");
        if (amount < 50) throw new NullPointerException("Your account lacks cash");
        return new Beans(amount, boston);
    }
}
