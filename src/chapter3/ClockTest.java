package chapter3;

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Clock clock = new Clock(23,59,59);

        System.out.println("The time was: " + clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());

        int newHour = scan.nextInt();
        clock.setHour(newHour);
        int newMinute = scan.nextInt();
        clock.setMinute(newMinute);
        int newSecond = scan.nextInt();
        clock.setSecond(newSecond);

        System.out.println("The time is now: " + clock.getHour() +":"+ clock.getMinute() +":"+ clock.getSecond());

    }
}
