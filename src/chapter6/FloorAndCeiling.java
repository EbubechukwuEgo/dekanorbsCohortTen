package chapter6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FloorAndCeiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert number here: ");
        double num = input.nextDouble();

        System.out.println(myFloor(num));
        System.out.println(myCeil(num));
        //myFloor(num);
        // myCeil(num);
    }

    private static int myFloor(double num) {
//        DecimalFormat df = new DecimalFormat("#");
//        df.setRoundingMode(RoundingMode.FLOOR);
//        System.out.println(df.format(num));

//        BigDecimal bd = new BigDecimal(Double.toString(num));
//        bd = bd.setScale(0,RoundingMode.FLOOR);
//        System.out.println(bd);

        return (int)num;
    }

    private static int myCeil(double num) {
//        DecimalFormat df = new DecimalFormat("#");
//        df.setRoundingMode(RoundingMode.CEILING);
//        System.out.println(df.format(num));

//        BigDecimal bd = new BigDecimal(Double.toString(num));
//        bd = bd.setScale(0,RoundingMode.CEILING);
//        System.out.println(bd);

        if (num > myFloor(num)) return (int)num + 1;
        return (int) num;
    }
}
