package dsa;

import java.util.PriorityQueue;
import java.util.Queue;

public class AlphaQueuePQ {

    public static void main(String[] args) {
        Queue<String> shonenSunday = new PriorityQueue<>();

        shonenSunday.add("Inuyasha");
        shonenSunday.add("Magi");
        shonenSunday.add("Zatch Bell");
        shonenSunday.add("Urusei Yatsura");
        shonenSunday.add("Ranma 1/2");

        System.out.println(shonenSunday);
        System.out.println(shonenSunday.peek());
        System.out.println(shonenSunday.poll());
        System.out.println(shonenSunday);
        System.out.println(shonenSunday.peek());

    }
}
