package ChapterSeven;

import java.util.Scanner;

public class arrayOfInput2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int number = scanner1.nextInt();
        String[] StudentsNames = new String[number];
        double[] StudentsScores = new double[number];

        int passes = 0;
        int fails = 0;
        for(int index = 0; index < number; index++){
            System.out.printf("Enter the name of Student %d%n", index + 1);
            String name = scanner2.nextLine();
            StudentsNames[index] = name;

            System.out.printf("Enter the score of Student %d%n", index + 1);
            double averageTotalScore = scanner1.nextDouble();
            StudentsScores[index] = averageTotalScore;

            if(averageTotalScore >= 50 && averageTotalScore <=100){
                ++passes;
            }
            else{
                ++fails;
            }
        }
        System.out.printf("%-15s%-23s%s%n","Student", "Total Average Score", "Comment");
        for(int index = 0; index < number; index++){
            System.out.printf("%-23s%-17s%s%n", StudentsNames[index], StudentsScores[index], StudentsScores[index] >= 50
            ? "Pass" : "Fail");
        }
        System.out.println();
        System.out.printf("Number of passes: %d%n", passes);
        System.out.printf("Number of fails: %d", fails);
        System.out.println();
    }
}
