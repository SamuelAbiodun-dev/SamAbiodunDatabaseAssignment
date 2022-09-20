import java.util.Scanner;

public class GasMileAge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mileage;
        int gallons;
        int totalMileage = 0;
        int totalGallons = 0;
        int counter = 1;
        double milesPerGallonsConsumed = 0;
        double average;
        System.out.print("Enter mileage value or -1 to quit: ");
        mileage = input.nextInt();
        System.out.print("Enter the gallons of fuel utilized: ");
        gallons = input.nextInt();

        average = mileage / gallons;
        System.out.printf("The miles per gallon used is: %.2f", average);
        System.out.println();

        while (mileage != -1 && gallons != -1) {
            totalMileage = totalMileage + mileage;
            totalGallons = gallons + gallons;
            counter += 1;

            System.out.print("Enter the gallons of fuel utilized: ");
            gallons = input.nextInt();
            average = (double) mileage / gallons;

            System.out.printf("The miles per gallon used is: %.2f", average);
            System.out.println();
        }
    if( counter != 0) {
        milesPerGallonsConsumed = (double) totalMileage / totalGallons;
        System.out.printf("The miles per gallons used for the whole trip is: %.2f", milesPerGallonsConsumed);
    }
    }
    }









