package exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Messenger bostonRedSox = new Messenger();
        try {
            Beans beans = bostonRedSox.buyBeans(49, false, false);
            System.out.println(beans);
        }
        catch (Exception ex){

        }
    }
}
