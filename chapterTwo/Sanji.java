import java.util.Scanner;

public class Sanji{

 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter first integer here: ");
  int number1 = input.nextInt();

  System.out.print("Enter second integer here: ");
  int number2 = input.nextInt();

  System.out.print("Enter third integer here: ");
  int number3 = input.nextInt();
  
  int sum = number1 + number2 + number3;
  System.out.print("The sum of the three numbers is: " + sum);

  int average = (number1 + number2 + number3) / 3;
  System.out.print("\nThe average of the three numbers is: " + average);
 
 }
}