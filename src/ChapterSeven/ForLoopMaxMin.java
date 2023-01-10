package ChapterSeven;

import java.util.Scanner;

public class ForLoopMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int counter = 0;
        int max = array[0];
        int min = array[0];
        while (counter < 5) {
            System.out.printf("%nEnter a number between 0 and 100 for time %d: ", counter);
            int score = input.nextInt();
            if (score >= 0 && score <= 100) {
                array[counter] = score;
                ++counter;
                if (array[1] > max) {
                    max = array[1];
                }
                if (array[2] > max) {
                    max = array[2];
                }
                if (array[3] > max) {
                    max = array[3];
                }
                if (array[4] > max) {
                    max = array[4];
                }

                if (array[1] < min) {
                    min = array[1];
                }
                if (array[2] < min) {
                    min = array[2];
                }
                if (array[3] < min) {
                    min = array[3];
                }
                if (array[4] < min) {
                    min = array[4];
                }
                System.out.printf("%nThe minimum number is: %d", min);
                System.out.printf("%nThe maximum number is: %d", max);
            }
        }
    }
}









//    }


