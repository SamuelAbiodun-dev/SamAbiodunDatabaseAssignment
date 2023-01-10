package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfUserInput {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many number of student?");
        int number = scanner1.nextInt();
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentScores = new ArrayList<>();

        int passes = 0;
        int fails = 0;
        for(int index = 0; index < number; index++){
            System.out.printf("Enter the name of student %d%n", index + 1);
            String name = scanner2.nextLine();
            studentNames.add(name);

            System.out.printf("Enter the score of student %d%n", index +1);
            double score = scanner1.nextDouble();
            studentScores.add(score);

            if(score >= 50 && score <= 100){
                ++passes;
            }
            if(score < 50){
                ++fails;
            }
        }
        System.out.printf("%-15s%-10s%s%n", "Student", "Score", "Comment");
        for(int index = 0; index < number; index++){
            System.out.printf("%-15s%-10.2f%s%n", studentNames.get(index),
                    studentScores.get(index), studentScores.get(index) >= 50 ? "Pass" : "Fail");
        }
        System.out.printf("%nNo of passes: %d%n", passes);
        System.out.printf("No of fails: %d%n", fails);
    }
}
