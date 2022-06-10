package toitleGrafficsTest;

import arraysSecond.Position;
import arraysSecond.SketchPad;
import arraysSecond.ToitleGraffics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static arraysSecond.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class ToitleGrafficsTest {

    private ToitleGraffics turtle;
    private SketchPad sketchPad;

    @BeforeEach
    public void setup(){
        turtle = new ToitleGraffics();
        sketchPad = new SketchPad(0,0);
    }

    @Test
    public void turtleExists(){
        assertNotNull(turtle);
    }

    @Test
    public void turtlePenIsUpByDefault(){
        boolean isPenDown = turtle.isPenDown();
        assertFalse(isPenDown);
    }

    @Test
    public void turtleCanMovePenDown(){
        turtle.isPenUp();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertTrue(turtle.isPenDown());
    }

    @Test
    public void turtlePenCanMoveUp(){
        turtle.penDown();
        assertTrue(turtle.isPenDown());
        turtle.penUp();
        assertFalse(turtle.isPenDown());
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

    @Test
    public void turtleCanTurnLeftWhileFacingNorth(){
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEast(){
        turtle.move(3, sketchPad);
        assertEquals(new Position(0,2), turtle.getCurrentPosition());
        turtle.move(2, sketchPad);
        assertEquals(new Position(0,3), turtle.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveForwardFacingSouth(){
        turtle.turnRight();
        assertSame(SOUTH, turtle.getCurrentDirection());

        turtle.move(3, sketchPad);
        assertEquals(new Position(2,0), turtle.getCurrentPosition());
        turtle.move(2, sketchPad);
        assertEquals(new Position(3,0), turtle.getCurrentPosition());
    }

    @Test
    public void whenPenIsDownTurtleWritesFacingEastTest(){
        turtle.penDown();
        SketchPad sketchPad = new SketchPad(5,5);
        turtle.move(5, sketchPad);
        String expected =     "* * * * * \n          \n          \n          \n          \n";
        assertEquals(expected, sketchPad.toString());
        assertEquals(new Position(0,4), turtle.getCurrentPosition());
    }

}
