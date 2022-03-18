import java.util.Scanner;

public class Length{
 
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the speed: ");
    double speed = input.nextDouble();
    System.out.print("Enter the acceleration: ");
    double acceleration = input.nextDouble();

    double length = (speed * speed) / (2 * acceleration);
    
    System.out.printf("The minimum runway length for this airplane is %.3f", length);
  
  }
}