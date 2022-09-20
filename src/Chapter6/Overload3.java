package Chapter6;
import java.util.Scanner;
public class Overload3 {
    public void buyPizza(String where, double price) {
        System.out.printf("Pizza bought at %s for $%.2f", where, price);
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Overload3 overload = new Overload3();

        System.out.println("Please enter the first place: ");
        String place1 = input.nextLine();

            System.out.println("Please enter the first price:");
            double price1 = input.nextDouble();
        overload.buyPizza(place1, price1);
        System.out.println();


        System.out.println("Please enter the second place: ");
        String place2 = input.nextLine();

        System.out.println("Please enter the second price:");
            double price2 = input.nextDouble();
            overload.buyPizza(place2, price2);







    }

}
