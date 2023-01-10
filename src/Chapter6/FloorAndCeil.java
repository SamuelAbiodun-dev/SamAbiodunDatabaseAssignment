package Chapter6;
import java.util.Scanner;
public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double number: ");
        double number = scanner.nextDouble();
        int floorValue =  floor(number);
        int ceilValue = ceil(number);
        System.out.printf("The floor value of %.2f is: %d%n", number, floorValue);
        System.out.printf("The ceil value of %.2f is: %d", number, ceilValue);
    }
    public static int floor(double number){
        int value = (int)(number * 10);
        return value / 10;
    }

    public static int ceil(double number){
        int value = (int)(number * 10);
        return (value / 10) + 1;
    }
}
