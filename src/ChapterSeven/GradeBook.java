package ChapterSeven;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){
        outPutGrades();
        System.out.printf("The average grade is: %.2f%n", getAverage());
        System.out.printf("The highest grade is %d and the lowest grade is %d%n%n",
                getMinimumGrade(), getMaximumGrade());
        outPutBarChart();
    }
    private int getMaximumGrade() {
        int highestGrade = grades[0];
        for(int grade : grades){
            if(grade > highestGrade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    private int getMinimumGrade() {
    int lowestGrade = grades[0];
    for(int grade : grades){
        if(grade < lowestGrade){
            lowestGrade = grade;
        }
    }
    return lowestGrade;
    }

    private double getAverage() {
        int total = 0;
        for(int grade : grades){
            total += grade;
        }
        return (double) total / grades.length;
    }

    private void outPutBarChart() {
        System.out.println("GRADE DISTRIBUTION:");
        int[] frequency = new int[11];

        for(int grade : grades){
            ++frequency[grade / 10];
        }
        for(int count = 0; count < frequency.length; count++){
            if(count == 10){
                System.out.printf("%5d: ", 100);
            }
            else{
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void outPutGrades() {
        System.out.println("The grades are:%n%n");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d : %3d%n", student + 1, grades[student]);
        }
    }
}
