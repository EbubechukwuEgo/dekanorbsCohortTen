package chapter7;

public class InitArray2 {
    public static void main(String[] args) {
        int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int index = 0; index < array.length; index++){
            System.out.printf("%5d%8d%n", index, array[index]);
        }
    }
}
