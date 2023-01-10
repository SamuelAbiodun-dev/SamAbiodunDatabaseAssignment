package ChapterSeven;
import java.util.Scanner;

public class arrayOfUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many number of student?");
        int number = scanner.nextInt();
        String[] studentNames = new String[number];
        double[] studentScores = new double[number];

        int passes = 0;
        int fails = 0;
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter the name of student %d%n", i + 1);
            String name = scanner2.nextLine();
            studentNames[i] = name;

            System.out.printf("Enter the score of student %d%n", i + 1);
            double score = scanner.nextDouble();
            studentScores[i] = score;

            if (score >= 50 && score <= 100) {
                ++passes;
            }

            if (score < 50) {
                ++fails;
            }
        }

        System.out.printf("%-15s%-10s%s%n", "Student", "Score", "Comment");
        for(int i = 0; i < number; i++) {
            System.out.printf("%-15s%-10.2f%s%n", studentNames[i], studentScores[i],
                    studentScores[i] >= 50 ? "Pass" : "Fail");
        }
        System.out.printf("%nNo of passes: %d%n", passes);
        System.out.printf("No of fails: %d%n", fails);

    }
}
