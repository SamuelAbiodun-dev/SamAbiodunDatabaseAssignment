package Chapter2;

public class Circle {
    public static void main(String[] args) {

    }

//    public int diameter() {
//        int num = 2;
//        int radius;
//        int rad = radius;
//       int diameter = num * rad;
//        return diameter;
//
//    }

    public double radius(double radius) {
        if(radius <= 0.0){
            System.out.println("Invalid input!");
        }
        else {
            return radius;
        }
        return radius;
    }

    public double diameter(double radius) {
        return radius * 2;

    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
}
