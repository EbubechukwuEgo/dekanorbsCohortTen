package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {

    @Test
    public void airConditionerOnTest(){
        //given
        AirConditioner ac = new AirConditioner();
        //when
        boolean onned = ac.turnedOn();
        //assert
        assertEquals(true, onned);
    }

    @Test
    public void airConditionerOffTest(){
        AirConditioner ac = new AirConditioner();
        boolean offed = ac.turnedOff();
        assertEquals(false, offed);
    }

    @Test
    public void increaseTemperatureTest(){
        AirConditioner ac = new AirConditioner();
        int increase = ac.increase(16, 24);
        assertEquals(8, increase);
    }

    @Test
    public void decreaseTemperatureTest(){
        AirConditioner ac = new AirConditioner();
        int decrease = ac.decrease(16, 24);
        assertEquals(8, decrease);
    }

    @Test
    public void aboveThirtyTest(){
        AirConditioner ac = new AirConditioner();
        int thirty = ac.increase(15, 45);
        assertEquals(30, thirty);
    }

    @Test
    public void belowSixteenTest(){
        AirConditioner ac = new AirConditioner();
        int sixteen = ac.decrease(16, 32);
        assertEquals(16, sixteen);
    }
}
