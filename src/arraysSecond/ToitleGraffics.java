package arraysSecond;

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

    public void move(int noOfMoves, SketchPad sketchPad) {
        if (isPenDown()) {
            if (currentDirection == EAST) writeOnColumn(noOfMoves, sketchPad);
        }
        if (currentDirection == EAST) increaseColumnBy(noOfMoves);
    }

    private void writeOnColumn(int noOfMoves, SketchPad sketchPad) {
        int[][] floor = sketchPad.getFloor();
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();
        noOfMoves += column;
        for (int i = column; i < noOfMoves; i++){
            floor[row][i] = 1;
        }
    }

    private void writeOnColumn(){

    }

    private void increaseColumnBy(int noOfMoves) {
        int currentColumnPosition = currentPosition.getColumn();
        currentPosition.setColumn(currentColumnPosition + noOfMoves - 1);
    }

    public Position getCurrentPosition(){
        return currentPosition;
    }
}
