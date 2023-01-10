package Chapter4;
import java.util.Scanner;
public class SentinelLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a grade or -1 to quit: ");
        int grade = scanner.nextInt();

        int total = 0;
        int gradeCounter = 0;

        while(grade != -1){
            total = total + grade;
            gradeCounter++;
            System.out.println("Enter a grade or -1 to quit: ");
            grade = scanner.nextInt();
        }
        if(gradeCounter != 0){
            double average = (double)total / gradeCounter;
            System.out.printf("The total of the " + gradeCounter + " grade(s) that you entered is: " + total);
            System.out.printf("%nThe class average of the " + gradeCounter + " grade(s) that you entered is: " + average);

        }
        else
            System.out.println("No grades were entered");
    }
}
