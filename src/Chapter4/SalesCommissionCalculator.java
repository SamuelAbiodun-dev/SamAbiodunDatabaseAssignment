package Chapter4;
import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossSales = 0;
        double value;
        int items = 1;
        int earnings;

        while (items <= 7) {
            System.out.printf("Input the value of items sold for day %d%n: ", items);
            value = input.nextDouble();
            grossSales += value;
            items++;
            System.out.printf("The total of sales made is: %.2f",grossSales);
            System.out.println("");
            System.out.printf("The percentage of the gross sales is : %.2f%n", (0.09 * grossSales));
        }
        System.out.printf("%nYour weekly earning is: %d", (int) (200 + (0.09 * grossSales)));

    }

}
