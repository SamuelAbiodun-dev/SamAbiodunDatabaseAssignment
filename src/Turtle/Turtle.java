//package Turtle;
//
//public class Turtle {
//    private int xCoordinate;
//    private int yCoordinates;
//    private Cardinal direction = Cardinal.EAST;
//    private Pen pen;
//    private int[][] floor;
//
//    public Turtle(){};
//    public Turtle(int x, int y){
//        xCoordinate = x;
//        yCoordinates = y;
//    }
//    public Turtle(int x, int y, Cardinal direction) {
//        this(x, y);
//        this.direction = direction;
//    }
//
//    public void changePenPosition(PenPosition position){
//        pen.setPosition(position);
//    }
//    public int getxCoordinate() {
//        return xCoordinate;
//    }
//
//    public void setxCoordinate(int xCoordinate) {
//        this.xCoordinate = xCoordinate;
//    }
//
//    public int getyCoordinates() {
//        return yCoordinates;
//    }
//
//    public void setyCoordinates(int yCoordinates) {
//        this.yCoordinates = yCoordinates;
//    }
//
//    public Cardinal getDirection() {
//        return direction;
//    }
//
//    public void setDirection(Cardinal direction) {
//        this.direction = direction;
//    }
//
//    public Pen getPen() {
//        return pen;
//    }
//
//    public void setPen(Pen pen) {
//        this.pen = pen;
//    }
//
//    public PenPosition getPosition() {
//    }
//    public void moveForward(Cardinal movementDirection, int numberOfSteps){
//        this.setDirection(movementDirection);
//        if(direction.equals(Cardinal.EAST)){
//            if(PenPosition.DOWN.equals(getPen().getPosition())) {
//                for (int i = 0; i < numberOfSteps; i++) {
//                    floor[xCoordinate][yCoordinates] = 1;
//                    xCoordinate++;
//                }
//            }
//            //this.xCoordinate += numberOfSteps - 1;
//        } else  if(direction.equals(Cardinal.SOUTH)){
//            if(PenPosition.DOWN.equals(getPen().getPosition())) {
//                for (int i = 0; i < numberOfSteps; i++) {
//                    floor[xCoordinate][yCoordinates] = 1;
//                    yCoordinates++;
//                }
//                yCoordinates--;
//            }
//           // this.xCoordinate += numberOfSteps - 1;
//        } else if(direction.equals(Cardinal.WEST)){
//            if(PenPosition.DOWN.equals(getPen().getPosition())) {
//                for (int i = 0; i < numberOfSteps; i++) {
//                    floor[xCoordinate][yCoordinates] = 1;
//                    xCoordinate--;
//                }
//                xCoordinate++;
//            }
//            //this.xCoordinate -= numberOfSteps - 1;
//        } else if(direction.equals(Cardinal.NORTH)){
//            if(PenPosition.DOWN.equals(getPen().getPosition())) {
//                for (int i = 0; i < numberOfSteps; i++) {
//                    floor[xCoordinate][yCoordinates] = 1;
//                    yCoordinates--;
//                }
//                yCoordinates++;
//            }
//            //this.yCoordinates -= numberOfSteps - 1;
//        }
//    }
//
//   }
