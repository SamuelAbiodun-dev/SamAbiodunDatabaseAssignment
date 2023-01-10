package Chapter5;
import java.util.Arrays;
import java.util.Scanner;
public class  StudentGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        String studentName = "";
        String studentGrade = "";
        String[] students = new String[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int counterE = 0;
        int counterF = 0;
        for (int i = 0; i < numberOfStudents; i++){
            System.out.printf("Enter student %d name: ", i + 1);
            studentName = input.next();
            students[i] = studentName;
            System.out.printf("Enter student %d grade: ", i + 1);
            studentGrade = input.next();
            grades[i] = studentGrade;
            switch (studentGrade) {
                case "A", "a" -> counterA++;
                case "B", "b" -> counterB++;
                case "C", "c" -> counterC++;
                case "D", "d" -> counterD++;
                case "E", "e" -> counterE++;
                default -> counterF++;
            }
        }
        System.out.printf("Grade A : %d%nGrade B : %d%nGrade C : %d%nGrade D: %d%nGrade E: %d%nGrade F: %d%n",
                counterA, counterB, counterC, counterD, counterE, counterF);
//        System.out.println(Arrays.toString(students));
//        System.out.println(Arrays.toString(grades));
        System.out.println("================================");
        System.out.printf("%s%17s%n", "Students", "Grade");
        System.out.println("================================");
        for (int i = 0; i < students.length; i++){
            System.out.printf("%s%18s              %n", students[i], grades[i]);
        }
        System.out.println("================================");
    }
}
