//package Turtle;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TurtleTest {
//private Turtle ijapa;
//private SketchPad sketchPad;
//    private double[][] turtleFloor;
//
//    @BeforeEach
//    public void setUp(){
//    ijapa = new Turtle();
//    Pen biro = new Pen();
//    ijapa.setPen(biro);
//    sketchPad = new SketchPad();
//}
//@Test
//    public void changePosition(){
//    assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
//}
//@Test
//    public void moveForward(){
//    assertEquals(0, ijapa.getxCoordinate());
//    assertEquals(0, ijapa.getyCoordinates());
//    assertEquals(Cardinal.EAST, ijapa.getDirection());
//    ijapa.moveForward(7, );
//    assertEquals(6, ijapa.getxCoordinate());
//    assertEquals(0, ijapa.getyCoordinates());
//}
//@Test
//    public void changeDirection(){
//    assertEquals(Cardinal.EAST, ijapa.getDirection());
//    ijapa.setDirection(Cardinal.SOUTH), ijapa;
//}
//@Test
//public void move(){
//    ijapa.moveForward(12, );
//    assertEquals(6, ijapa.getxCoordinate());
//    assertEquals(0, ijapa.getyCoordinates());
//
//    for(int i = 0; i < sketchPad.getFloor().length; i++){
//    for(int j = 0; j < sketchPad.getFloor().length; j++) {
//        if (turtleFloor[i][j] == 1){
//            System.out.print("* ");
//        }
//        else{
//            System.out.print(" ");
//        }
//    }System.out.println();
//    }
//    }
//}