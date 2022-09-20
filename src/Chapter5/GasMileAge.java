package Chapter5;
import java.util.Scanner;
public class GasMileAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMile = 0;
        int totalGallon = 0;

        while(true) {
            System.out.print("Enter mile covered: ");
            int mile = input.nextInt();

            System.out.print("Enter gallon used: ");
            int gallon = input.nextInt();

            totalMile = mile + totalMile;
            totalGallon = gallon + totalGallon;

            System.out.println("Press 1 to continue and 0 to exit");
            int response = input.nextInt();

            if(response == 1) {
                continue;
            }
            else{
                break;
            }
        }
        double average = totalMile / totalGallon;
        System.out.printf("The total mile is %d and total gallon is %d, the average is %f", totalMile, totalGallon, average);
    }
}
