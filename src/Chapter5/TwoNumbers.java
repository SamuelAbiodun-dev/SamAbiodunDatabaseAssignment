package Chapter5;
import java.util.Scanner;
public class TwoNumbers {

       public static void main(String[] args) {

           Scanner input = new Scanner(System.in);
           System.out.print("Enter first number or type 1.5 to exit: ");
           int number1 = input.nextInt();

           System.out.println("Enter second number or type 1.5 to exit: ");
           int number2 = input.nextInt();

           int sum = number1 + number2;


           do {
               System.out.printf("Sum is %d%n", sum);
           break;
           } while (number1 != 1.5 && number2 !=1.5);

           System.out.print("Do you wish to perform the operation again?");



}

       }

