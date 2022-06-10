package dsa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AlphaQueue {
    public static void main(String[] args) {
        Queue<Integer> bengals = new LinkedList<>();

        bengals.add(9);
        bengals.add(1);
        bengals.add(85);
        bengals.add(87);
        bengals.add(30);
        bengals.offer(91);

        System.out.println(bengals.peek());
        System.out.println(bengals.poll());
        System.out.println(bengals);
        System.out.println(bengals.peek());
        System.out.println(bengals.poll());
        System.out.println(bengals);
        System.out.println(bengals.peek());
        System.out.println(bengals.element());
        System.out.println(bengals);
        System.out.println(bengals.poll());
        System.out.println(bengals);
        System.out.println(bengals.remove());
        System.out.println(bengals);
    }
}
