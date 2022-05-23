package arraysSecond;

import javax.swing.text.Position;
import java.util.Arrays;

import static arraysSecond.Direction.*;

public class ToitleGraffics {

    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private arraysSecond.Position currentPosition;

    public static void main(String[] args) {
        int[][] toitle = new int[20][20];




    }

    public void penDown(){
        biro.penDown();
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void isPenUp() {
         biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == SOUTH) face(WEST);
        if (currentDirection == EAST) face(SOUTH);
    }

    public void turnLeft() {
        if (currentDirection == EAST) face(NORTH);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

//    public void move(int noOfMoves) {
//        if (currentDirection == EAST) increaseColumnBy(noOfMoves);
//    }

//    private void increaseColumnBy(int noOfMoves) {
//        currentDirection.setColumn();
//    }

//    public Position getCurrentPosition(){
//        return currentPosition;
//    }
}
