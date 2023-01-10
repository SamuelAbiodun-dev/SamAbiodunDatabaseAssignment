package ChapterEight;

public class Dog {
    private String petName;
    private int age;
    private String food;
    private String ownerName;


    public Dog(String petName, int age, String food, String ownerName){
        this.petName = petName;
        this.age = age;
        this.food = food;
        this.ownerName = ownerName;

    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBark() {
        return "Bark";
    }
}
