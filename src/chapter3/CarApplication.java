package chapter3;

public class CarApplication {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota Land Cruiser", "2004", 79.99);
        Car car2 = new Car("Mercedes GL450", "2009", 89.99);

        System.out.println("The initial price of car 1 is " + car1.getPrice());
        System.out.println("The initial price of car 2 is " + car2.getPrice());
        car1.setPrice(car1.getPrice() - ((car1.getPrice() / 100) * 5));
        car2.setPrice(car2.getPrice() - ((car2.getPrice() / 100) * 7));
        System.out.printf("The final price of car 1 after the 5 percent discount is %.2f%n", car1.getPrice());
        System.out.printf("The final price of car 2 after the 7 percent discount is %.2f", car2.getPrice());
        System.out.println(car1.getModel());
        System.out.println(car2.getYear());
        car1.setYear("2003");
        car2.setModel("Toyota Camry");
        System.out.println(car1.getYear());
        System.out.println(car2.getModel());


    }
}
