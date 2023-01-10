package ChapterTen;

public class Animal implements Movable {


    public Animal(String mouth) {
    }
//    public Animal(String mouth) {
//        this.mouth = mouth;
//    }
    public void speak(){
        System.out.println("Speaking like an animal");
    }

    @Override
    public void move() {

    }
}
