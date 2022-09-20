package Chapter2;

public class Chp2Comparison {

public int number (int num1) {
    int value1 = num1;
    return value1;
}
public int number2 (int num2) {
    int value2 = num2;
    return value2;
}
public int numSquare (int num1) {
    int square1 = num1 * num1;
    return square1;
}
public boolean numGreater (int num1) {
    int num2 = 100;
    return (num1 < num2);
}
public boolean numSquareLesser(int num1) {
    int num2 =  100;
    int result = num1 * num1;
    return (result < num2);
}
public boolean numSquareGreater(int num1) {
    int num2 = 100;
    int result = num1 * num1;
    return (result > num2);
}
    public boolean numSquareEqual(int num1) {
        int num2 = 100;
        int result = num1 * num1;
        return (result == num2);
    }
    public boolean numSquareNotEqual(int num1) {
        int num2 = 100;
        int result = num1 * num1;
        return (result != num2);
    }
}
