package chapter9;

public class Animal extends LivingThing{


    public Animal(){
        super();
        System.out.println("Creating animals");
    }

    @Override
    public void move(){
        super.move();
        System.out.println("Move like animal");
    }

    public void yourFathersMove(){
        super.move();
    }
}
