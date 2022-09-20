package Chapter2;
import java.util.Scanner;
public class ChapterTwoComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value1 = input.nextInt();

        int value2 = 100;

        if (value1 == value2) {
            System.out.printf("%d == %d%n%n", value1, value2);
        }
        if (value1 != value2) {
            System.out.printf("%d != %d%n%n", value1, value2);
        }
        if (value1 < value2) {
            System.out.printf("%d < %d%n%n", value1, value2);
        }
        if (value1 > value2) {
            System.out.printf("%d > %d%n%n", value1, value2);
        }
        if (value1 <= value2) {
            System.out.printf("%d <= %d%n%n", value1, value2);
        }
        if(value1 >= value2) {
            System.out.printf("%d >= %d%n%n", value1, value2);
        }
    }
}
