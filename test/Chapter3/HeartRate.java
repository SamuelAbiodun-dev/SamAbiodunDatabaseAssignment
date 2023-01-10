package Chapter3;

import java.time.LocalDate;

public class HeartRate {
    private double MaxHeartRate;
    private double TargetHeartRate;
    private static int age;
    private static int yearOfBirth;
    //public static int getAge () {
        //return LocalDate.now().getYear() - yearOfBirth;
    //}
    public static double getMaxHeartRate() {
        return 220 - age;
    }
    public static double getTargetHeartRate() {
        double range = getMaxHeartRate() * 0.85;
         return range;
    }
    public static double range() {
        double theRange = (double) 85 / 100;
        return theRange;
    }
}
