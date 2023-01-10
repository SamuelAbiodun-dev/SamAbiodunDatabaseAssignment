package ChapterEight;

public abstract class Mammal extends  Animal2{
    private String mammaryGland;

    public String getMammaryGland() {
        return mammaryGland;
    }

    public void setMammaryGland(String mammaryGland) {
        this.mammaryGland = mammaryGland;
    }

    public abstract void move();
}
