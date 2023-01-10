package ChapterEight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Animal2Test {
@BeforeEach
    public void setUp(){

}
@Test
    public void checkAnimals(){
    Animal2 bessie = new Dog2();
    Dog2 bingo = new Dog2();
    bessie = new Cat2();
    bessie.setId(1);
    bessie.setName("Max");
    bingo.setId(2);
    bingo.setName("Jack");
    bessie = new Python();
    bessie.move();

}
}