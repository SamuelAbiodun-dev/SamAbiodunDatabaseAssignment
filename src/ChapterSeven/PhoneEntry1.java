package ChapterSeven;
import java.util.Scanner;
public class PhoneEntry1 {



        public static void main (String[] args){
            options();

        }

        public static void options (){
            //This method gives the user choices on what to do

            char choice;
            char enterNumber = 'n';
            char showNumber = 's';
            char closeBook = 'c';

            String read;
            String freeLine = "error";
            Scanner keyboard = new Scanner(System.in);
            while (true){

                System.out.println("Please select from the following");
                System.out.println("n to Enter the number");
                System.out.println("s to Show the number ");
                System.out.println("c to Close the Phone book");

                read = keyboard.nextLine();
                choice = read.charAt(0);
                switch (choice) {
                    case 'n':
                        
                        System.out.println();
                    case 's':
                        System.out.println();
                    case 'c':
                        break;
                    default: System.out.println("Invalid Entry");


                }
            }
        }

    }

