import java.util.Scanner;

public class Kilograms{

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter number in pounds: ");
      double pounds = input.nextDouble();
      
      double kilograms = pounds * 0.454;
      
      System.out.printf("%.0f pounds is %.3f kilograms", pounds, kilograms);
   }
}