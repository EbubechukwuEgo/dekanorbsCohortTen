package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {

    @Test
    public void turnedOnBike(){
        Bicycle onned = new Bicycle();
        boolean bike = onned.turnedOn();
        assertEquals(true, bike);
    }

    @Test
    public void turnedOffBike(){
        Bicycle offed = new Bicycle();
        boolean bike = offed.turnedOff();
        assertEquals(false, bike);
    }

    @Test
    public void acceleratedBike(){
        Bicycle acc = new Bicycle();

    }

    @Test
    public void deceleratedBike(){

    }
}
