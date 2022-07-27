package chapter6;

public class XMethods {
    public static void main(String[] args) {
        double x;

        x = Math.abs(-7.5);
        System.out.println(x);
        x = Math.floor(5 + 2.5);
        System.out.println(x);
        x = Math.abs(9) + Math.ceil(2.2);
        System.out.println(x);
        x = Math.ceil(-5.2);
        System.out.println(x);
        x = Math.abs(-5) + Math.abs(4);
        System.out.println(x);
        x = Math.ceil(-6.4) - Math.floor(5.2);
        System.out.println(x);
        x = Math.ceil(-Math.abs(-3 + Math.floor(2.5)));
        System.out.println(x);
    }
}
