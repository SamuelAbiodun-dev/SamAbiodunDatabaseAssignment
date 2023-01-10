package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ChapterSeven.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleGraphicsTest {
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        turtle = new Turtle();
    }

    @Test
    public void turtleExistsTest() {
        assertNotNull(turtle);
    }

    @Test
    public void turtleCanMovePenUpTest() {
        turtle.penUp();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest() {
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void turtleCanTurnSouthWardTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
//    }
    }
    @Test
    public void turtleCanTurnWestWardTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
    }
    @Test
    public void turtleCanTurnNorthWardTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
    }
    @Test
    public void turtleCanTurnEastWardTest(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
    }
    @Test
    public void turtleCanTurnLeftFacingEastWardTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
//    }
    }
    @Test
    public void turtleCanTurnLeftFacingNorthWardTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingWestWardTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingSouthWardTest() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    public void turtleCanMoveForwardFacingEastWardTest(){
        assertEquals(new Position(0,0), turtle.getCurrentPosition());

        turtle.move(5);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }
}