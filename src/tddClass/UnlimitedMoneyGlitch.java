package tddClass;

import java.util.Scanner;

public class UnlimitedMoneyGlitch {

    public static void main(String[] args){

        Scanner peanuts = new Scanner(System.in);

        int lucy = peanuts.nextInt();

        for(int franklin = 0; franklin <=12; franklin++){
            int charlieBrown = lucy * franklin;
            System.out.printf("%d * %d = %d%n", lucy, franklin, charlieBrown);
        }


    }
}
