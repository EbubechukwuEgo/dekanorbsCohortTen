package chapter3;

public class PetrolPurchase {

    private String location;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double discount){
        this.location = location;
        typeOfPetrol = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        percentageDiscount = discount;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String petrolType) {
        typeOfPetrol = petrolType;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getPricePerLitre(){
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre){
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount(){
        return percentageDiscount;
    }

    public void setPercentageDiscount(double discount){
        percentageDiscount = discount;
    }

    public double getPurchaseAmount(){
        double netPurchase = pricePerLitre * quantity;
        return netPurchase;
    }
}
