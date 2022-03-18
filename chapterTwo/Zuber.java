import java.util.Scanner;

public class Zuber{

 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter first integer: ");
  int number1 = input.nextInt();

  System.out.print("Enter second integer: ");
  int number2 = input.nextInt();
  
  System.out.print("Enter third integer: ");
  int number3 = input.nextInt();

  if(number1 == number2 == number3){
   System.out.printf("%d == %d ==%d");
  }
  if(number1 < number2 < number3){
   System.out.print("The largest integer is " + number3 + " and the smallest integer is " + number1);
  }
  if(number2 < number1 < number3){
   System.out.print("The largest integer is " + number3 + " and the smallest integer is " + number2);
  }
  if(number1 < number3 < number2){
   System.out.print("The largest integer is " + number2 + " and the smallest integer is " + number1);
  }
  if(number2 < number3 < number1){
   System.out.print("The largest integer is " + number1 + " and the smallest integer is " + number2);
  }
  if(number3 < number1 < number2){
   System.out.print("The largest integer is " + number2 + " and the smallest integer is " + number3);
  }
  if(number3 < number2 < number1){
   System.out.print("The largest integer is " + number1 + " and the smallest integer is " + number3);
  }
 }
}