import java.util.Scanner; 

public class Comparison{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in); 
  System.out.print(“Enter integer here: ”); int number = input.nextInt();
  if(number > 100){
   System.out.printf(“%d > %d%n”, number, 100);
  } if (number == 100) {
   System.out.printf(“%d == %d%n”, number, 100);
  } if (number != 100) {
   System.out.printf(“%d != %d%n”, number, 100);
  } if (number < 100) {
   System.out.printf(“%d < %d%n”, number, 100);
  }
 }
}