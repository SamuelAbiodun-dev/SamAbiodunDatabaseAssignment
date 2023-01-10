package ChapterSeven;

import static ChapterSeven.Direction.*;

public class Turtle {
private Pen pen = new Pen();
private Direction currentDirection = EAST;
private Position currentPosition = new Position(0, 5);
    public void penUp() {
        pen.penUp();
    }
    public boolean isPenUp() {
        return pen.isPenUp();
    }
    public void penDown() {
        pen.penDown();
    }
    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight(){
        switch(currentDirection){
            case EAST -> face(SOUTH);
            case SOUTH -> face(WEST);
            case WEST -> face(NORTH);
            case NORTH -> face(EAST);
        }
    }

    public void turnLeft(){
        switch (currentDirection){
            case EAST -> face(NORTH);
            case NORTH -> face(WEST);
            case WEST -> face(SOUTH);
            case SOUTH -> face(EAST);
        }
    }
    public void face(Direction direction) {
    currentDirection = direction;

    // OR
//        {
//            currentDirection = SOUTH;
//        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int numberOfSteps) {
    switch(currentDirection){
        case EAST -> {
            currentPosition.setColumn(currentPosition.getColumn()
                    +numberOfSteps);
        }
    }
    }
}
