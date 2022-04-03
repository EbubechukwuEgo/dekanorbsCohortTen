package arrays;

public class TenNumbers {

    public static void main(String[] args){

        int[] ashito = {23, 34, 32, 69, 77, 91, 24, 7, 81, 18};
        int total = 0;
        int max = ashito[0];
        for(int counter = 0; counter<ashito.length; counter++){
            total += ashito[counter];
            System.out.printf("%d ",ashito[counter]);
            if(ashito[counter] > max) max = ashito[counter];
        }
        double average = total/ashito.length;
        System.out.println("\nThe total sum of numbers in the array is: "+total);
        System.out.println("The largest number in the array is: "+max);
        System.out.println("The average of numbers in the array is: "+average);

    }


}
