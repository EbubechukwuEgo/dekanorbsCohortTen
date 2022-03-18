import java.util.Scanner;

public class Cercle{
 
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter the radius: ");
  int radius = input.nextInt();
  
  System.out.printf("The diameter of a circle is %d", radius*2);
  
  System.out.printf("%nThe circumference of a circle is %f", 2*3.14159*radius);
  
  System.out.printf("%nThe area of a circle is %f", 3.14159*radius*radius);
 }
}