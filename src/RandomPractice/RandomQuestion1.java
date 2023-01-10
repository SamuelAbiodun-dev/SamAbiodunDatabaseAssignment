package RandomPractice;
import java.util.Scanner;
public class RandomQuestion1 {

    public static void main(String[] args) {
        int grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly enter your grade here: ");
        grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.printf("""
                    !***!
                    Congratulations! Your grade of %d earns you an A in this course""", grade);
        }
        else
            System.out.printf("Sorry! You do not have an A with %d!", grade);
        }
    }
