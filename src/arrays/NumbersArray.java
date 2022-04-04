package arrays;

public class NumbersArray {

    public int maxNumber(int[] sanAntonio) {
        int max = sanAntonio[0];
        for(int bowen = 0; bowen<sanAntonio.length; bowen++){
            if(sanAntonio[bowen] > max) max = sanAntonio[bowen];
        }
        return max;
    }

    public int minNumber(int[] sanAntonio) {
        int min = sanAntonio[0];
        for(int green = 0; green<sanAntonio.length; green++){
            if(sanAntonio[green] < min) min = sanAntonio[green];
        }
        return min;
    }

    public int averageOfArray(int[] goldenState) {
        int total = 0;

        for(int barnes = 0; barnes<goldenState.length; barnes++){
            total += goldenState[barnes];
        }
        int average = total/goldenState.length;
        return average;
    }
}
