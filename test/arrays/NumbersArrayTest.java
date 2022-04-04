package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersArrayTest {


    @Test
    public void maxNumberTest(){
       NumbersArray numbers = new NumbersArray();
       int[] sanAntonio = {21, 20, 9, 50, 2};
       assertEquals(50, numbers.maxNumber(sanAntonio));
    }

    @Test
    public void minNumberTest(){
        NumbersArray numbers = new NumbersArray();
        int[] sanAntonio = {21, 20, 9, 50, 2};
        assertEquals(2, numbers.minNumber(sanAntonio));
    }

    @Test
    public void averageTest(){
        NumbersArray numbers = new NumbersArray();
        int[] goldenState = {23, 35, 30, 11, 24, 41};
        assertEquals(27, numbers.averageOfArray(goldenState));
    }
}
