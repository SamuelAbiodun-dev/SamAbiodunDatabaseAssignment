package Chapter4;

import static org.junit.jupiter.api.Assertions.*;

class GraduateTest {
    public static void main(String[] args) {
        Graduate grad1 = new Graduate("Ajibade Samuel", 100);
        Graduate grad2 = new Graduate("John Terry", 40);

        System.out.printf("%s's grade is: %s%n", grad1.getName(), grad1.getGrade());
        System.out.printf("%s's grade is: %s%n", grad2.getName(), grad2.getGrade());
    }

}