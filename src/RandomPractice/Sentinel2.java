package RandomPractice;

import java.util.Scanner;

public class Sentinel2 {

    public static void main(String[] args) {
        int scoreCount = 0;
        Scanner input = new Scanner(System.in);
        int totalScore = 0;
        while(scoreCount != 10) {
            System.out.printf("Enter a score %d:%n%n" , (scoreCount + 1));
            int score = input.nextInt();

            if(score >= 0 && score < 100){
                totalScore += score;
                scoreCount++;
            }
        }
        System.out.println("Total score is " + totalScore);
    }

   }
