package arraysSecond;

import java.util.Arrays;

import static arraysSecond.Direction.*;

public class ToitleGraffics {

    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private arraysSecond.Position currentPosition = new Position(0,0);

//    public static void main(String[] args) {
//        int[][] toitle = new int[20][20];
//
//
//
//
//    }

    public void penDown(){
        biro.penDown();
    }

    public boolean isPenDown() {
        return biro.isDown();
    }

    public void penUp(){
        biro.penUp();
    }
    public boolean isPenUp() {
        return true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == SOUTH) face(WEST);
        if (currentDirection == EAST) face(SOUTH);
    }

    public void turnLeft() {
        if (currentDirection == NORTH) face(WEST);
        if (currentDirection == EAST) face(NORTH);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void move(int noOfMoves) {
        if (currentDirection == EAST) increaseColumnBy(noOfMoves);
    }

    private void increaseColumnBy(int noOfMoves) {
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition + noOfMoves - 1);
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }
}
