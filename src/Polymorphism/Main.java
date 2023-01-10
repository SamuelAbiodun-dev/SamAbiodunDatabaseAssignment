package Polymorphism;

class Main {
    public static void main(String[] args) {
        Animal ologbo = new Cat();
        animalMakesSound(ologbo);

        Animal aja = new Dog();
        animalMakesSound(aja);

        Cat ologboDudu = new Cat();
        animalMakesSound(ologboDudu);
    }
    private static void animalMakesSound(Animal animal){
        animal.speak();
    }
}