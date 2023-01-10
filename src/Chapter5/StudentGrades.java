package Chapter5;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentCounter = 1;
        int nameCounter = 1;
        System nameHolder;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        while(studentCounter <= 5 && nameCounter <= 5){
            System.out.printf("Student %d, please enter your name: %n", nameCounter);
            String name = input.nextLine();
            System.out.print("Enter your grade: ");
            String grade = input.nextLine();

            switch(grade){
                case "A":
                    aCount++;
                    if(nameCounter == 1){
                        if(grade.equals("A")){
                            System.out.printf("%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 2){
                        if(grade.equals("A")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 3){
                        if(grade.equals("A")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 4){
                        if(grade.equals("A")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 5){
                        if(grade.equals("A")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    break;
                case "B":
                    bCount++;
                    if(nameCounter == 1){
                        if(grade.equals("B")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 2){
                        if(grade.equals("B")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 3){
                        if(grade.equals("B")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 4){
                        if(grade.equals("B")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 5){
                        if(grade.equals("B")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    break;
                case "C":
                    cCount++;
                    if(nameCounter == 1){
                        if(grade.equals("C")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 2){
                        if(grade.equals("C")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 3){
                        if(grade.equals("C")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 4){
                        if(grade.equals("C")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 5){
                        if(grade.equals("C")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    break;
                case "D":
                    dCount++;
                    if(nameCounter == 1){
                        if(grade.equals("D")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 2){
                        if(grade.equals("D")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 3){
                        if(grade.equals("D")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 4){
                        if(grade.equals("D")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    if(nameCounter == 5){
                        if(grade.equals("D")){
                            System.out.printf("%n%s has grade: %s", name, grade);
                        }
                    }
                    break;
            }
            nameCounter++;
        }
        System.out.println();
        System.out.println("Grade Report: ");
        if(studentCounter != -1){
            System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students" +
                    " who received each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount);
        }
        else {
            System.out.println("No grades were entered");
        }
        System.out.println();
        for(int i = 5; i <= nameCounter; i++){

        }
        }
    }

