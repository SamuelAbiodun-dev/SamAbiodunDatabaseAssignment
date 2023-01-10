package ChapterSeven;
import java.util.Arrays;
import java.util.Scanner;


public class SortStudents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];
        System.out.println("Enter the name and score foreach student: ");
        for(int index = 0; index < students.length; index++){
            System.out.print("Student " + (index + 1) + ": ");
            students[index] = input.next();
            System.out.print("Score: ");
            scores[index] = input.nextInt();
        }
        int[] sortedScores = sortDecreasing(scores);
        String[] sortedStudents = sortStudent(sortedScores, scores, students);
        System.out.printf("%-15s%s%n", "Student", "Score");
        for (int i = 0; i < sortedScores.length; i++) {
            System.out.printf("%-15s%d%n", sortedStudents[i], sortedScores[i]);
        }
    }
    private static String[] sortStudent(int[] sortedScores, int[] scores, String[] students) {
        String[] sortedStudents = Arrays.copyOf(students, students.length);
        for(int i = 0; i < sortedScores.length; i++){
            int score = sortedScores[i];
            int index = getIndex(scores, score);
            sortedStudents[i] = students[index];
        }
        return sortedStudents;
    }
    private static int getIndex(int[] scores, int score) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == score) {
                return i;
            }
        }
        return -1;
    }
    public static int[] sortDecreasing(int[] numbers) {
        int [] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < sortedNumbers.length; i++) {
            for (int j = i + 1; j < sortedNumbers.length; j++) {
                if (sortedNumbers[i] < sortedNumbers[j]) {
                    int temp = sortedNumbers[i];
                    sortedNumbers[i] = sortedNumbers[j];
                    sortedNumbers[j] = temp;
                }
            }
        }
            return sortedNumbers;
    }
}
