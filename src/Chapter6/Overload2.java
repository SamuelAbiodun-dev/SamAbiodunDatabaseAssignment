package Chapter6;

public class Overload2 {
public int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
}
public double add (int num1, double num2) {
    double sum = num1 + num2;
    return sum;
}
public double add(double num1, double num2) {
    double sum = num1 + num2;
    return sum;
}
public double add(double num1, int num2) {
    double sum = num1 + num2;
    return sum;
}

    public static void main(String[] args) {

    Overload2 overload = new Overload2();
        System.out.print("Sum of the two numbers is: " + overload.add(25,23));

        System.out.printf("%nSum of the two numbers is: " + overload.add(25,23.0));

        System.out.printf("%nSum of the two numbers is: " + overload.add(25.0, 23.0));

        System.out.printf("%nSum of the two numbers is: " + overload.add(25.0, 23));
    }

}
