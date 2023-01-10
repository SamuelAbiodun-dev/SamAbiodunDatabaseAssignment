package Interfaces;

public class Car implements Vehicle{
    @Override
    public void accelerate(){
        System.out.println("i am a moving car");
    }
}
