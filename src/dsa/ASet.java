package dsa;

import java.util.HashSet;
import java.util.Set;

public class ASet {
    public static void main(String[] args) {
        Set<String> mexicanDishes = new HashSet<>();

        mexicanDishes.add("Nachos");
        mexicanDishes.add("Tacos");
        mexicanDishes.add("Quesadilla");
        mexicanDishes.add("Enchilada");
        mexicanDishes.add("Tamale");

        Set<String> spanishDishes = new HashSet<>();

        spanishDishes.add("Empanada");
        spanishDishes.add("Marzipan");
        spanishDishes.add("Gazpacho");

        mexicanDishes.addAll(spanishDishes);
        mexicanDishes.removeAll(spanishDishes);
//        mexicanDishes.retainAll(spanishDishes);
//        if (mexicanDishes.isEmpty()){
//            System.out.println("No such thing as Mexican Dishes.");
//        } else {
//            System.out.println("There are Mexican Dishes here.");
//        }
//        mexicanDishes.remove("Enchilada");

        // System.out.println(mexicanDishes.size());

        System.out.println("The hashCode for the Mexican dishes is "+ mexicanDishes.hashCode());
        System.out.println("The hashCode for the Spanish dishes is "+ spanishDishes.hashCode());


        System.out.println(mexicanDishes);
    }
}
