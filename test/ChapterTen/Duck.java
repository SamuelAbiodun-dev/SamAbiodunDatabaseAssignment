package ChapterTen;

public class Duck {

    private Flyable flyable;
    private Quackable quackable;

    public Duck(Flyable fly, Quackable quack){
        this.flyable = fly;
        this.quackable = quack;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackAble(Quackable quackable) {
        this.quackable = quackable;
    }


    public void quack(){
        quackable.quack();
    }
    public void fly(){
        flyable.fly();
    }
}
