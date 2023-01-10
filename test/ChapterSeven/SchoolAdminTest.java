package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolAdminTest {

    private  int[][] scores = {{98, 79, 77, 95, 84}, {83, 89, 74, 91, 90}};
    private SchoolAdmin admin;
    @BeforeEach
    public void setUp(){
        admin = new SchoolAdmin(scores);
    }
@Test
    public void getScores(){
        for(int counter = 0; counter < admin.getNativeScores().length; counter++){
        }
}
    @Test
    public void calculate(){
admin.calculateAveragesScore();

double[] averages = admin.getAverageScores();
assertTrue(averages[0] > 0);
assertTrue(averages[1] > 0);
assertTrue(averages[0] > 86.6);
assertTrue(averages[1] > 85.4);
System.out.println(averages[0]);
System.out.println(averages[1]);
    }
}