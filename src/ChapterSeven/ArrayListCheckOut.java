package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCheckOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();
        ArrayList<Double> totalList = new ArrayList<>();

        while (true){
            System.out.println("Enter the items bought: ");
            String item = input.nextLine();
            itemList.add(item);

            System.out.println("Enter the quantity of items bought: ");
            int quantity = input.nextInt();
            quantityList.add(quantity);

            System.out.println("Enter the price of items bought: ");
            double price = input.nextDouble();
            priceList.add(price);

            double total = price * quantity;
            totalList.add(total);

            input.nextLine();
            System.out.println("Add more items?: ");
            String response = input.nextLine();
            response = response.toLowerCase();
            if(!response.equals("yes")){
                double totalPrice = ArrayListCheckOutMethod.getTotal(totalList);
                ArrayListCheckOutMethod.displayResult(itemList, quantityList, priceList, totalList, totalPrice);
                break;
                }
            }
        }
    }

