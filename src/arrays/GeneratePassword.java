package arrays;

import java.util.Random;

public class GeneratePassword {

    public static void main(String[] args){

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String all = upper+lower+numbers;

        int length =12;
        char[] password = new char[12];
        Random rand = new Random();



        for(int i = 0; i < length ;i++){
            password[i] = all.charAt(rand.nextInt(all.length()));
        }
        System.out.println("Generated password is: " + new String(password));
    }
}
