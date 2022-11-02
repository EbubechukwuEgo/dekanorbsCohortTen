package chapter7;

import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        Scanner ticket = new Scanner(System.in);
        int[] seats = new int[10];

        System.out.println("Please type 1 for First Class or 2 for Economy");
        int tickets = ticket.nextInt();
        if (tickets == 1) {
            System.out.println("First Class");
        } else if (tickets == 2) {
            System.out.println("Economy");
        } else {
            System.out.println("Why are you even here?");
        }


    }
}
