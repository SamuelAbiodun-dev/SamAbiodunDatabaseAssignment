package Chapter3;

import java.util.Scanner;
public class ScoreAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int classCounter = 1;

        while(classCounter <= 5) {
            System.out.print("Type your class: ");

            int grade = input.nextInt();
            total = total + grade ;

            classCounter = classCounter + 1;
        }

        int average = total / 10;

        System.out.printf("Total number of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
