package ReceiptAndOthers;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadPhoneBook {
    public static void main(String[] args){
        try(Scanner input = new Scanner(Paths.get("receipt.txt"))){
            PhoneBook receipt = new PhoneBook();
            while(input.hasNext()){
                receipt.displayReceipt(input.next(), input.next(), input.next(), input.next());
                //System.out.println();
            }
        }
        catch(SecurityException | NoSuchElementException | IOException e){
            System.out.print("");
        }
    }
}
