package ChapterEight;

public class Domestic {
    private String petName;
    private int age;
    private String food;
    private String ownerName;
    private String bark;

    public Domestic(Dog animal){
        this.petName = animal.getPetName();
        this.age = animal.getAge();
        this.food = animal.getFood();
        this.ownerName = animal.getOwnerName();
        this.bark = animal.getBark();
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

    public String bark() {
        return "I am barking";
    }


}
