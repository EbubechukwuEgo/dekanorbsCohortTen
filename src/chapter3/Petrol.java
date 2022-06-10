package chapter3;

public class Petrol {

    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Houston", "Unleaded", 5, 4.99, 0.05);


        petrol.setLocation("San Antonio");
        System.out.println(petrol.getLocation());

        petrol.getPricePerLitre();
        petrol.setTypeOfPetrol("Diesel");
        petrol.getTypeOfPetrol();
        petrol.getQuantity();
        System.out.println(petrol.getPurchaseAmount());

    }
}
