package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionSetTest {

    @Test
    public void turnedOnTest(){
        TelevisionSet tv = new TelevisionSet();
        boolean turnedOn = tv.isOn();
        assertEquals(true, turnedOn);
    }

    @Test
    public void changedChannel(){
        TelevisionSet tv = new TelevisionSet();
        boolean channel = tv.channelChange();
        assertEquals(false, channel);
    }

    @Test
    public void volume(){
        TelevisionSet tv = new TelevisionSet();
        int change = tv.volumeChange(30, 26);
        assertEquals(-4, change);
    }






}
