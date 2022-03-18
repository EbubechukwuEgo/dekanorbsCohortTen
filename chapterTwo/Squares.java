import java.util.Scanner;

public class Squares{
 
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);

  System.out.print(“Enter first integer: “);
  int number1 = input.nextInt();
  
  System.out.print(“Enter second integer: ”); 
  int number2 = input.nextInt();

  int square1 = number1 * number1;
  int square2 = number2 * number2;
  System.out.print(“The square of the first integer is: “ + square1);
  System.out.print(“The square of the second integer is: “ + square2);

  int sum = square1 + square2;
  System.out.print(“The sum of the two squared numbers is: ” + sum);

  int minus = square1 - square2;
  System.out.print(“The difference of the two squared numbers is: “ + minus);
  
 }
}