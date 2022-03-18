import java.util.Scanner;

public class Interest{

  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the monthly saving amount: ");
    double savings = input.nextDouble();
 
    double interest = 0.05 / 12;

    double month = savings * (1 + interest);

    double secondMonth = (savings + month) * (1 + interest);

    double thirdMonth = (savings + secondMonth) * (1 + interest);

    double fourthMonth = (savings + thirdMonth) * (1 + interest);

    double fifthMonth = (savings + fourthMonth) * (1 + interest);

    double sixthMonth = (savings + fifthMonth) * (1 + interest);

    System.out.printf("After the sixth month, the account value is $%.2f", sixthMonth);

  }
}