package Chapter3;
import java.time.LocalDate;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HealthProfile profile = new HealthProfile("Samuel", "Abiodun", "male",
                "December", 21, 2012, 10, 34.6);

        System.out.printf("The initial record is:%nFirst Name: %s%nLast Name: %s%nGender: " +
                        "%s%nMonthOfBirth: %s%nDayOfBirth: " +
                "%s%nYearOfBirth: %s%nHeight: %s%nWeight: %s%n",profile.getFirstName(),
                profile.getLastName(), profile.getGender(), profile.getMonthOfBirth(),
                profile.getDayOfBirth(), profile.getYearOfBirth(), profile.getHeight(), profile.getWeight());


        System.out.println("Please enter your first name: ");
        String theFirstName = input.nextLine();
        profile.setFirstName(theFirstName);
        System.out.println();

        System.out.println("Please enter your last name: ");
        String theLastName = input.nextLine();
        profile.setLastName(theLastName);
        System.out.println();

        System.out.println("Please enter your Gender: ");
        String gender = input.nextLine();
        profile.setGender(gender);
        System.out.println();

        System.out.println("Please enter your Month of Birth: ");
        String monthOfBirth = input.nextLine();
        profile.setMonthOfBirth();
        System.out.println();

        System.out.println("Please enter your Day of Birth: ");
        int dayOfBirth = input.nextInt();
        profile.setDayOfBirth();
        System.out.println();

        System.out.println("Please enter your Year of Birth: ");
        int yearOfBirth = input.nextInt();
        profile.setYearOfBirth();
        System.out.println();


        System.out.println("Please enter your height: ");
        double height = input.nextDouble();
        profile.setHeight(height);
        System.out.println();

        System.out.println("Please enter your weight: ");
        double weight = input.nextDouble();
        profile.setWeight(weight);
        System.out.println();

        System.out.printf("Your new age is: %d%n", profile.getAge());
        System.out.printf("Heart rate target is: %f%n", profile.getTargetHeartRate());
        System.out.printf("Maximum heart rate is: %f%n", profile.getMaxHeartRate());
        System.out.printf("Body Mass Index is: %f%n", profile.getBMI());











    }

}