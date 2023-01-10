package ChapterSeven;

import javax.swing.*;
import java.util.Arrays;

import static myPrintAndInput.printAndInput.input;
import static myPrintAndInput.printAndInput.print;

public class AssignGrades {

    public static void main(String[] args) {
        String numberOfStudent = input("Enter the number of students: ");
        int[] scores = new int[Integer.parseInt(numberOfStudent)];

            int count = 1;
        for(int indexOfScores = 0; indexOfScores < scores.length; indexOfScores++){
            String eachScore = input("Enter score " + count);
                scores[indexOfScores] = Integer.parseInt(eachScore);
                count++;
        }
        char[] grades = getGrades(scores);
        int count2 = 1;
        for(int index = 0; index < scores.length; index++){
            print("Student " + count2 + " scored " + scores[index] + " and has grade " + grades[index]);
            count2++;
        }
        print("The highest score is: " + max(scores));

    }

    public static int max(int[] array){
        int max = array[0];
        for(int index = 1; index < array.length; index++){
            if(array[index] > max){
                max = array[index];
            }
        }
        return max;
    }

    private static char[] getGrades(int[] scores) {
        //int best = max(scores);
        char[] grades = new char[scores.length];
        for(int index = 0; index < scores.length; index++){
            int score = scores[index];
            int range = score / 10;
            switch(range) {
                case 9 -> grades[index] ='A';

                case 8 -> grades[index] = 'B';

                case 7 -> grades[index] = 'C';

                case 6 -> grades[index] = 'D';

                case 5 -> grades[index] = 'E';

                case 4 -> grades[index] = 'F';
                }
            }
        return grades;
        }


}
