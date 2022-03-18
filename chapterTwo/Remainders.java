import java.util.Scanner;

public class Remainders{

 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print(“Enter integer here: ”);
  int number = input.nextInt();
  
  if(number % 3 == 0){
   System.out.print(“Number is divisible by 3”);
  } else {
   System.out.print(“Number is not divisible by 3”);
  }
 }
}
