package Chapter4;

//import java.util.Scanner;

class StudentGrade2Test {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        StudentGrade2 student1 = new StudentGrade2("Samuel Festus", 90.56);
        StudentGrade2 student2 = new StudentGrade2("Simeon Ernest", 91.65);

        System.out.printf("The average score of %s is %.2f with a grade of %s", student1.getName(), student1.getAverage(), student1.gradeLetter());
        System.out.printf("%nThe average score of %s is %.2f with a grade of %s", student2.getName(), student2.getAverage(), student2.gradeLetter());



    }
}