package ChapterSeven;

class GradeBookTest {
    public static void main(String[] args) {
        int[] grades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook gradeBook = new GradeBook("Computer programming using Java", grades);
        System.out.println("_____________________________________________________________________");
        System.out.println("|                                                                    |");
        System.out.printf( "|The GradeBook for %s                   |%n", gradeBook.getCourseName());
        System.out.println("|                                                                    |");
        System.out.println("_____________________________________________________________________");
        gradeBook.processGrades();

    }
}