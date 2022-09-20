package Chapter2;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

        public static void main(String[] args){
            Car car1 = new Car("Toyota", "2009", 230.1);

            Car car2 = new Car("Lexus", "2007", 500.0);

            System.out.println("Before discount: "+car1.getPrice());
            System.out.println("Before discount: "+car2.getPrice());


            car1.setDiscount(5);
            car2.setDiscount(7);


            System.out.println("After discount: "+car1.getPrice());
            System.out.println("After discount: "+car2.getPrice());


        }
    }
