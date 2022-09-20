package Chapter5;
import java.util.Scanner;
public class GradeOfStudent {
        public static void main(String[] args) {
            int score, i;
            double totalMarks = 0, percentage;

           Scanner input = new Scanner(System.in);

            System.out.println("Enter Number of Subject: ");
            score = input.nextInt();

            System.out.println("Enter Marks of " + score + " Subjects is:");
            for (i = 0; i < score; i++) {
                totalMarks += score;
            }
            System.out.println("Total Marks : " + totalMarks);
            // Each subject is of 100 Marks
            percentage = (totalMarks / (score * 100)) * 100;

            /* Printing grade of a student using switch case statement */
            switch ((int) percentage / 10) {
                case 9 -> System.out.println("Grade : A+");
                case 8, 7 -> System.out.println("Grade : A");
                case 6 -> System.out.println("Grade : B");
                case 5 -> System.out.println("Grade : C");
                default -> System.out.println("Grade : D");
            }
        }
    }

