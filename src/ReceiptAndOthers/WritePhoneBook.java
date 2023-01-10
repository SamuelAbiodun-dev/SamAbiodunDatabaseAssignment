package ReceiptAndOthers;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class WritePhoneBook {
    public static void main(String[] args) throws FileNotFoundException {
        try(Formatter output = new Formatter("receipt.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n",
                    "Enter your name, address, telephone number and email",
                    "Press end-of-file button to end input");
            while(input.hasNext()){
                output.format("%-15s%-35s%-15s%s%n", input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
            }
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e){
            e.printStackTrace();
        }
    }
}
