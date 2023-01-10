package ChapterTen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    @Test
    public void testDuckMovement(){
        F1 f1 = new F1();
        F2 f2 = new F2();
        F3 f3 = new F3();
        Q1 q1 = new Q1();
        Q2 q2 = new Q2();
        Duck mountainDuck = new Duck(f2, q1);
        Duck rubberDuck = new Duck(f3, q2);
        Duck ilasaDuck = new Duck(f2, q2);
        mountainDuck.fly();
        mountainDuck.setFlyable(f1);
        mountainDuck.fly();
        rubberDuck.quack();
        ilasaDuck.fly();
        ilasaDuck.quack();
        ilasaDuck.setQuackAble(q1);
    }

}