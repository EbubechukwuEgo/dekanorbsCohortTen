package chapter3;

public class Petrol {

    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Houston", "Unleaded", 5, 4.99, 0.05);


        petrol.setLocation("San Antonio");
        System.out.println(petrol.getLocation());

        petrol.setPricePerLitre(3.99);
        System.out.println(petrol.getPricePerLitre());
        petrol.setTypeOfPetrol("Diesel");
        System.out.println(petrol.getTypeOfPetrol());
        petrol.setPercentageDiscount(0.2);
        petrol.setQuantity(4);

        System.out.println(petrol.getPercentageDiscount());
        System.out.println(petrol.getQuantity());
        System.out.println(petrol.getPurchaseAmount());

    }
}
