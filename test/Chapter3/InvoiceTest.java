package Chapter3;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(" ", " ", 0, 0.0);
        Scanner input = new Scanner(System.in);
        String item;
        String description;
        int quantity;
        double price;

        System.out.print("Enter the Id of the item: ");
        item = input.nextLine();
        invoice.setPartId(item);

        System.out.print("Enter description of item purchased: ");
        description = input.nextLine();
        invoice.setPartDescription(description);

        System.out.print("Enter the Quantity of item purchased: ");
        quantity = input.nextInt();
        if(quantity > 0) {
            invoice.setQuantityOfItemPurchased(quantity);
        }
        System.out.print("Enter the price per item: ");
        price = input.nextDouble();
        if(price > 0){
            invoice.setPricePerItem(price);
            System.out.printf("The Total amount for all items purchased = $%.2f\n",
                    invoice.getInvoiceAmount());
            input.close();
        }

    }
}
