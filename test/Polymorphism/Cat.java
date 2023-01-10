package Polymorphism;

import static org.junit.jupiter.api.Assertions.*;

class Cat extends Animal{
@Override
    public void speak(){
    System.out.println("Meows!");
}
}