package Chapter2;

import static org.junit.jupiter.api.Assertions.*;

public class BuyPetrolTest {


        public static void main(String[] args) {
            BuyPetrol myBuyPetrol = new BuyPetrol("Oando", 20,10,5,10.5);

            System.out.println("The petrol station's location: " + myBuyPetrol.getStationLocation());
            System.out.println("The type of petrol: " + myBuyPetrol.getPetrolType());
            System.out.println("Petrol quantity in litres: " + myBuyPetrol.getQuantity());
            System.out.println("Petrol price per litre: " + myBuyPetrol.getPrice());
            System.out.println("The percentage discount: " + myBuyPetrol.getPercentageDiscount());
            System.out.println("The petrol station's location: " + myBuyPetrol.getPurchaseAmount());
            System.out.println();

            myBuyPetrol.setStationLocation("Yaba");
            myBuyPetrol.setPetrolType("Fuel");
            myBuyPetrol.setQuantity(125);
            myBuyPetrol.setPrice(125.50);
            myBuyPetrol.setPercentageDiscount(2.5);

            System.out.println("The petrol station's location: " + myBuyPetrol.getStationLocation());
            System.out.println("The type of petrol: " + myBuyPetrol.getPetrolType());
            System.out.println("Petrol quantity in litres: " + myBuyPetrol.getQuantity());
            System.out.println("Petrol price per litre: " + myBuyPetrol.getPrice());
            System.out.println("The percentage discount: " + myBuyPetrol.getPercentageDiscount());
            System.out.println("The petrol station's location: " + myBuyPetrol.getPurchaseAmount());
        }
    }


