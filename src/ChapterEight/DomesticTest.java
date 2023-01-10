package ChapterEight;

public class DomesticTest {
    public static void main(String[] args) {
        Dog max = new Dog("Maximum", 1, "Sealed meat food", "Grace Dee");
        Domestic domesticAnimal = new Domestic(max);
        domesticAnimal.setAge(2);
        System.out.println(max.getPetName());
        System.out.println(max.getFood());
        max.setFood("Bone and Milk");
        System.out.println(domesticAnimal.bark());
    }
}
