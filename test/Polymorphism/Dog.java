package Polymorphism;

import static org.junit.jupiter.api.Assertions.*;

class Dog  extends Animal {
    @Override
public void speak(){
    System.out.println("Woofs!");
}
}