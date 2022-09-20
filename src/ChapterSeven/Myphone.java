package ChapterSeven;
import java.util.Scanner;
public class Myphone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int proceed = 0;
        int back = 0;
        int phoneBook = 1;

        while (phoneBook <= 6) {
           System.out.print("Search contact");
           int searchContact = input.nextInt();

           if(searchContact == 1) {
               proceed = proceed + 1;
           }
           else {
               back = back + 1;
           }
           phoneBook = phoneBook + 1;
        }
    }
}
