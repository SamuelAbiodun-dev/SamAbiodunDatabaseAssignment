package Chapter3;

import static org.junit.jupiter.api.Assertions.*;

class CarAppTest {
    public static void main(String[] args) {
        CarApp car1 = new CarApp("Toyota", "2009", 230.1);

        CarApp car2 = new CarApp("Lexus", "2007", 500.0);

        System.out.println("The price of the first car before the removal of discount is: " + car1.getPrice());
        System.out.println("The price of the second car before the removal of discount is: " + car2.getPrice());

        System.out.println();

        car1.setDiscount(5);
        car2.setDiscount(7);

        System.out.println("The price of the first car after the removal of discount is: " + car1.getPrice());
        System.out.println("The price of the second car after the removal of discount is: " + car2.getPrice());

    }
}

