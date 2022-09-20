package Chapter6;
import java.util.Scanner;
public class Overload {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Overload overload = new Overload();

        System.out.println("Enter where you want to buy the pizza here: ");
        String where = input.nextLine();
        overload.buyPizza(where);

        System.out.println("Enter the price of the pizza you want to buy: ");
        int price = input.nextInt();
        overload.buyPizza(where,price);

        System.out.println();

    }
        public String buyPizza(String where) {
            System.out.println("I bought pizza at:" + where);
            return "I bought pizza at" + where;
        }
        public String buyPizza() {
            return "I bought pizza at justa random place!";
        }
        public void buyPizza(String where, int price) {
            System.out.printf("I bought pizza at %s at the price of %d", where, price);
        }
    }

