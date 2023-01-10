package Chapter6;

import java.util.Scanner;

public class ParkingChargesMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();

        System.out.println("Enter hour: ");
        int hour = input.nextInt();
        ParkingCharges parkingCharges = new ParkingCharges(name, hour);
        double maximum = parkingCharges.getMaximumGarageCharges();
        double minimum = parkingCharges.getMinimumGarageCharges();
        parkingCharges.incrementAfter3Hours();
        parkingCharges.chargesWithinTheHourRangeOfThree();
        parkingCharges.twenty_fourHoursParkingDiscount();
    }
}
