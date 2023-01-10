package Chapter5;
import java.util.Scanner;
public class TwelveDays {

    public static void main(String[] args) {
        int day;
        Scanner christmas = new Scanner(System.in);
        System.out.println("Enter a day of Christmas (1-12), to display a song!:");
        day = christmas.nextInt();

            if (day == 1) {
                System.out.println("On the " + day + "st day of Christmas, my true love gave to me, ");
            }
            if (day == 2) {
                System.out.println("On the " + day + "nd day of Christmas, my true love gave to me, ");
            }
            if (day == 3) {
                System.out.println("On the " + day + "rd day of Christmas, my true love gave to me, ");
            }

            if (day != 1 && day != 2 && day != 3 && day <= 12) {
                System.out.println("On the " + day + "th day of Christmas, my true love gave to me, ");
            }

            if (day > 12) {
                System.out.println("Invalid input!");
            }
            switch (day) {
                case 12 -> TwelveDaysTest.display12();
                case 11 -> TwelveDaysTest.display11();
                case 10 -> TwelveDaysTest.display10();
                case 9 -> TwelveDaysTest.display9();
                case 8 -> TwelveDaysTest.display8();
                case 7 -> TwelveDaysTest.display7();
                case 6 -> TwelveDaysTest.display6();
                case 5 -> TwelveDaysTest.display5();
                case 4 -> TwelveDaysTest.display4();
                case 3 -> TwelveDaysTest.display3();
                case 2 -> TwelveDaysTest.display2();
                case 1 -> TwelveDaysTest.display1();
            }
            System.out.println();
            //Thread.sleep(5000 + 1000L * count);
    }
}