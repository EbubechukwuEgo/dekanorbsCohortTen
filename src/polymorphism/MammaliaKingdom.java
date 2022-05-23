package polymorphism;

public class MammaliaKingdom {
    public static void main(String[] args) {
        Mammal dolphin = new Whales();
        Felines lion = new Panthers();
        Felines cheetah = new Felines();
        Rodents corona = new Bats();
        Mammal disgusting = new Rodents();

        dolphin.move();
        lion.hunt();
        cheetah.hunt();
        corona.move();
        disgusting.move();
    }
}
