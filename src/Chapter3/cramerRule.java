package Chapter3;

import java.util.Scanner;

public class cramerRule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an individual value for a, b, c, d, e, f: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();

        if ((a * d) - (b * c) == 0) {
            System.out.println("The determinant equation has no solution");
        } else {
            int x = (int) (((e * d) - (b * f)) / ((a * d) - (b * c)));
            int y = (int) (((a * f) - (e * c)) / ((a * d) - (b * c)));
            System.out.printf("x is %d and y is %d", x, y);
        }
    }
}
