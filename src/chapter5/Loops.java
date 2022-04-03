package chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        int count = 0;
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        for(;count <= 100;){
            System.out.println("Enter a score or enter a value greater than 100 to exit.");
            count = scanner.nextInt();
            System.out.println("AsherFlo");
            /*if(){
                break;
            }*/
        }
    }
}
