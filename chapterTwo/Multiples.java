import java.util.Scanner;

public class Multiples{

 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print(“Enter first integer: “);
  int number1 = input.nextInt();

  System.out.print(“Enter second integer: ”);
  int number2 = input.nextInt();

  if((number1 * 3) % (number2 * 2) == 0){
   System.out.print(“Number 1 tripled is a multiple of Number 2 doubled.”);
  } else {
   System.out.print(“Number 1 tripled is not a multiple of Number 2 doubled.”);
  }
 }
}