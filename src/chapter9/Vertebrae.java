package chapter9;

public class Vertebrae extends Animal{

    public Vertebrae(){
        super();
        System.out.println("Creating Vertebrates");
    }

    public void move(){
        super.move();
        System.out.println("Move like vertebrate");
    }
}
