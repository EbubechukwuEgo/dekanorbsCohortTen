package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceGameTest {

    @Test
    public void yourLossTest(){
        DiceGame dice = new DiceGame();
        int loss = dice.gameOver();
        assertEquals(2, loss);
    }

    @Test
    public void yourFirstPointTest(){
        DiceGame dice = new DiceGame();
        int point = dice.gameContinue();
        assertEquals(4, point);
    }
}
