package Chapter3;
import java.util.Scanner;
class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Your age is: %d%n", age);

        System.out.printf("Maximum heart rate is: %.2f%n", HeartRate.getMaxHeartRate());

        System.out.printf("Heart rate target is: %.2f%n", HeartRate.getTargetHeartRate());

        System.out.printf("Heart rate range is: %.2f%%\n", HeartRate.range());
    }
}