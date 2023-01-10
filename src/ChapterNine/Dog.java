package ChapterNine;

public class Dog extends Animal{
    public void speak(){
        System.out.println("I can bark like a local Dog");
    }
    public void fathersSpeak(){
        super.speak();
    }
}
