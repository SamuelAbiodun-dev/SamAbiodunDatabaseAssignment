package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

//    @BeforeEach
//    Circle circle;
@Test
    void testThatObjectExists() {
    Circle circle = new Circle();
    assertNotNull(circle);
}
@Test
    void testTheDiameterOfACircle() {
    Circle circle = new Circle();
    assertEquals(28.0,circle.diameter(14.0));
}

@Test
    void enterRadius(){
    Circle circle = new Circle();
    assertEquals(7.0, circle.radius(7.0));
}
@Test
    void circumference() {
    Circle circle = new Circle();
    assertEquals(18.84955592153876, circle.circumference(3));
}
@Test
    void area() {
        Circle circle = new Circle();
        assertEquals(28.274333882308138, circle.area(3));
    }
}