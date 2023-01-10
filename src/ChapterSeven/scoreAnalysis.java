package ChapterSeven;

import java.util.Scanner;

public class scoreAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Enter scores: (negative number signifies end): ");

            int[] scores = new int[5];
            int num;
            int numberOfScores;
            int average;
            numberOfScores = average = 0;
            for (int index = 0; index < scores.length; index++) {
                num = input.nextInt();

                if (num < 0) {
                    break;
                }


                scores[index] = num;
                average += num;
                numberOfScores++;
            }
            if(numberOfScores > 0) {
                average /= numberOfScores;
            }
            int aboveOrEqual;
            int below;
            aboveOrEqual = below = 0;
            for (int index = 0; index < numberOfScores; index++) {
                if (scores[index] >= average) {
                    aboveOrEqual++;
                } else {
                    below++;
                }
            }
        System.out.println("\nAverage of scores: " + average);
        System.out.println("\nNumber of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
