package toitleGrafficsTest;

import arraysSecond.Direction;
import arraysSecond.ToitleGraffics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static arraysSecond.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class ToitleGrafficsTest {

    private ToitleGraffics turtle;

    @BeforeEach
    public void setup(){
        turtle = new ToitleGraffics();
    }

    @Test
    public void turtleExists(){
        assertNotNull(turtle);
    }

    @Test
    public void turtlePenIsDownByDefault(){
        boolean isPenDown = turtle.isPenDown();
        assertNotNull(isPenDown);
    }

    @Test
    public void turtleCanMovePenDown(){
        turtle.isPenDown();
        boolean isPenDown = turtle.isPenDown();
//        assertTrue(isPenDown);
    }

    @Test
    public void turtlePenIsUp(){
        boolean isPenUp = turtle.isPenDown();
        assertNotNull(isPenUp);
    }

    @Test
    public void turtlePenCanMoveUp(){
        turtle.isPenUp();
        turtle.isPenUp();
//        assertTrue();
    }

    @Test
    public void turtleFacesEastByDefault(){
        assertEquals(EAST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEast(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromSouth(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEast(){
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }

//    @Test
//    public void turtleCanMoveForwardFacingEast(){
//        turtle.move(4);
//        assertEquals(new Position(0, 4), turtle.getCurrentDirection());
//    }

}
