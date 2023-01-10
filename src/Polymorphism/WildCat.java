package Polymorphism;

import ChapterNine.Cat;

public class WildCat extends Cat {
    @Override
    public void speak(){
        System.out.println("No sound for now, I want chop");
    }
}
