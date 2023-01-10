package Chapter4;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int average;
        int total = 0;
        int gradeCounter = 0;
        while (gradeCounter <= 9){
            System.out.println("Kindly enter your grade: ");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter++;
        }
        average = total / gradeCounter;
        System.out.printf("The total grade entered is: " + total);
        System.out.printf("%nThe total grade entered is: " + average);
    }
}
